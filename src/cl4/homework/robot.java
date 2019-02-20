package cl4.homework;



public class robot {
    public static void main(String[] args) {
        String move = "LR";
        System.out.println(moveRobot(move));
    }

    public static boolean moveRobot(String move) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < move.length(); i++) {
            char m = move.charAt(i);
            switch (m) {
                case 'R': {
                    x++;
                    break;
                }
                case 'L': {
                    x--;
                    break;
                }
                case 'D': {
                    y--;
                    break;
                }
                case 'U': {
                    y++;
                    break;
                }


            }

        }
       return x==0 && y==0;
    }

}

