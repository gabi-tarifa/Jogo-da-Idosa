import java.util.Scanner;

public class codigo4 {
    public static int p1 = 0, p2 = 0;
    public static int games = 1;

    public static boolean victory(char[][] velha) {
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
        }
    }
}
    public static void main(String[] args) {
        boolean keep_Going = true;
        char keep = ' ';
        int i = 0;
        int x = 0, y = 0;
        int p1a = p1, p2a = p2;
        Scanner ler = new Scanner(System.in);
        char[][] velha = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' }};
        do {;
            for (i=0;i<9;i++) {
                if (p1a != p1 || p2a != p2)
                    break;
                p1a = p1; p2a = p2;                
                System.out.println(velha[0][0] + " | " + velha[0][1] + " | " + velha[0][2]);
                System.out.println("--|---|--");
                System.out.println(velha[1][0] + " | " + velha[1][1] + " | " + velha[1][2]);
                System.out.println("--|---|--");
                System.out.println(velha[2][0] + " | " + velha[2][1] + " | " + velha[2][2]);
                System.out.printf("Insira um numero de 0 a 2: ");
                x = ler.nextInt();
                System.out.printf("Insira outro numero de 0 a 2: ");
                y = ler.nextInt();

                if (games%2==1)
                    velha[x][y] = 'x';
                else
                    velha[x][y] = 'o';
            
                games++;
                

        }
        System.out.printf("Continue? Press any key to stop ");
        keep = ler.next();
        if (keep != ' ')
            break;
    } while (keep_Going == true);
}
