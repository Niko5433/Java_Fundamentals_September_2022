package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }
        public String getTime(){
            return this.time;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputLineArr = inputLine.split("_");

            Song song = new Song(inputLineArr[0],inputLineArr[1],inputLineArr[2]);

            songList.add(song);
        }

        String typeListPrint = scanner.nextLine();
        if (typeListPrint.equals("all")){
            for (Song item:songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item:songList) {
                if (item.getTypeList().equals(typeListPrint)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
