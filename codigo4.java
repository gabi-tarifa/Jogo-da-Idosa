import java.util.Scanner;

public class codigo4 {
    public static int p1 = 0, p2 = 0;
    public static int res = 0;
    public static int games = 1;
    public static char[][] velha = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
    public static Scanner ler = new Scanner(System.in);
    public static int p1a = p1, p2a = p2;

    public static void main(String[] args) {
        boolean keep_Going = true;
        char keep = ' ';
        int i = 0;
        int x = 0, y = 0;
        do {
            for (i = 0; i < 9; i++) {
                System.out.println(velha[0][0] + " | " + velha[0][1] + " | " + velha[0][2]);
                System.out.println("--|---|--");
                System.out.println(velha[1][0] + " | " + velha[1][1] + " | " + velha[1][2]);
                System.out.println("--|---|--");
                System.out.println(velha[2][0] + " | " + velha[2][1] + " | " + velha[2][2]);
                System.out.println(" X " + p1 + "/" + p2 + " O");
                if (p1a != p1 || p2a != p2)
                    break;
                p1a = p1;
                p2a = p2;
                System.out.printf("Insira um numero de 0 a 2: ");
                x = ler.nextInt();
                System.out.printf("Insira outro numero de 0 a 2: ");
                y = ler.nextInt();

                if(x != 0 && x != 1 && x != 2 && y != 0 && y != 1 && y != 2)
                    System.out.println("Por favor insira um valor válido...");
                else {
                    if(velha[x][y] == ' ') {
                        if (games % 2 == 1)
                            velha[x][y] = 'x';
                        else
                            velha[x][y] = 'o';
                    } else {
                        System.out.println("Por favor insira outro par ordenado...");
                        i = i + 1;
                        games = games - 1;
                    }
                }
            victory(res);
            games++;
            }
            System.out.println(velha[0][0] + " | " + velha[0][1] + " | " + velha[0][2]);
            System.out.println("--|---|--");
            System.out.println(velha[1][0] + " | " + velha[1][1] + " | " + velha[1][2]);
            System.out.println("--|---|--");
            System.out.println(velha[2][0] + " | " + velha[2][1] + " | " + velha[2][2]);
            System.out.println(" X " + p1 + "/" + p2 + " O");
            System.out.printf("Continue? Press any key to continue and 'n' to stop: ");
            keep = ler.next().charAt(0);
            if (keep == 'n')
                keep_Going = false;
            else {
                velha[0][0] = ' ';
                velha[0][1] = ' ';
                velha[0][2] = ' ';
                velha[1][0] = ' ';
                velha[1][1] = ' ';
                velha[1][2] = ' ';
                velha[2][0] = ' ';
                velha[2][1] = ' ';
                velha[2][2] = ' ';
                p1a = p1;
                p2a = p2;
            }
        } while (keep_Going == true);
    }

    public static int victory(int res) {
        if (velha[0][0] == 'x' && velha[0][1] == 'x' && velha[0][2] == 'x') {
            p1++;
        } else if (velha[1][0] == 'x' && velha[1][1] == 'x' && velha[1][2] == 'x') {
            p1++;
        } else if (velha[2][0] == 'x' && velha[2][1] == 'x' && velha[2][2] == 'x') {
            p1++;
        } else if (velha[0][0] == 'x' && velha[1][0] == 'x' && velha[2][0] == 'x') {
            p1++;
        } else if (velha[1][0] == 'x' && velha[1][1] == 'x' && velha[1][2] == 'x') {
            p1++;
        } else if (velha[2][0] == 'x' && velha[2][1] == 'x' && velha[2][2] == 'x') {
            p1++;
        } else if (velha[0][0] == 'o' && velha[0][1] == 'o' && velha[0][2] == 'o') {
            p2++;
        } else if (velha[1][0] == 'o' && velha[1][1] == 'o' && velha[1][2] == 'o') {
            p2++;
        } else if (velha[2][0] == 'o' && velha[2][1] == 'o' && velha[2][2] == 'o') {
            p2++;
        } else if (velha[0][0] == 'o' && velha[1][0] == 'o' && velha[2][0] == 'o') {
            p2++;
        } else if (velha[1][0] == 'o' && velha[1][1] == 'o' && velha[1][2] == 'o') {
            p2++;
        } else if (velha[2][0] == 'o' && velha[2][1] == 'o' && velha[2][2] == 'o') {
            p2++;
        } else if (velha[0][0] == 'o' && velha[1][1] == 'o' && velha[2][2] == 'o') {
            p2++;
        } else if (velha[0][2] == 'o' && velha[1][1] == 'o' && velha[2][0] == 'o') {
            p2++;
        } else if (velha[0][0] == 'x' && velha[1][1] == 'x' && velha[2][2] == 'x') {
            p1++;
        } else if (velha[0][2] == 'x' && velha[1][1] == 'x' && velha[2][0] == 'x') {
            p1++;
        }
        if (p1 < p2)
            res = p2;
        else if (p2 < p1)
            res = p1;
        return res;
    }

}
