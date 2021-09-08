package weekly_challenge;

public class input {
    public static void main(String[] args) {
        int[][] scores={{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        long answer1;
        String answer2;

        //week1 input
        week1 a1 = new week1();
        answer1=a1.solution(3,20,4);

        //week2 input
        week2 a2 =new week2();
        answer2=a2.solution(scores);

        //답 출력
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer1);
        System.out.println(answer1);
        System.out.println(answer1);
    }
}
