package java_answer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42579
 */
public class Lessons42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println((new Lessons42579()).solution(genres, plays));
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Music>> genresMap = getMap(genres, plays);
        List<Genre> genreList = getGenreList(genresMap);
        return getPlayList(genresMap, genreList);
    }

    private int[] getPlayList(Map<String, List<Music>> genresMap, List<Genre> genreList) {
        List<Integer> playList = new ArrayList<>();

        for(Genre genre : genreList) {
            List<Music> musicList = genresMap.get(genre.name);
            Collections.sort(musicList);

            int toIndex = musicList.size() > 1 ? 2 : 1;
            playList.addAll(musicList.subList(0, toIndex).stream()
                    .map(music -> music.index)
                    .collect(Collectors.toList()));
        }

        return playList.stream().mapToInt(i->i).toArray();
    }

    private List<Genre> getGenreList(Map<String, List<Music>> genresMap) {
        List<Genre> genreList = new ArrayList<>();

        for(String key : genresMap.keySet()) {
            int sum = genresMap.get(key).stream()
                    .map(music -> music.plays)
                    .reduce(0, Integer::sum);

            genreList.add(new Genre(key, sum));
        }

        genreList.sort(Comparator.comparing(Genre::getCount));
        Collections.reverse(genreList);
        return genreList;
    }

    private Map<String, List<Music>> getMap(String[] genres, int[] plays) {
        Map<String, List<Music>> map = new HashMap<>();
        for(int i =0; i< genres.length; i++) {
            String genre = genres[i];
            if(map.containsKey(genre)) {
                map.get(genre).add(new Music(plays[i], i));
            } else {
                List<Music> musicList = new ArrayList<>();
                musicList.add(new Music(plays[i], i));
                map.put(genre, musicList);
            }
        }
        return map;
    }

    private class Music implements Comparable<Music>{
        int plays;
        int index;

        public Music(int plays, int index) {
            this.plays = plays;
            this.index = index;
        }

        @Override
        public int compareTo(Music o) {
            if (this.plays > o.plays) {
                return -1;
            }

            if (this.plays == o.plays) {
                if(this.index < o.index)
                    return -1;
                else
                    return 1;
            }

            return 1;
        }
    }

    private class Genre {
        String name;
        int count;

        public Genre(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}
