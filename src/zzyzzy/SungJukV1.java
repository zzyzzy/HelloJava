package zzyzzy;

public class SungJukV1 {

    public static void main(String[] args) {

        String name = "혜교";
        int kor = 99;
        int eng = 98;
        int mat = 99;

        int tot = kor + eng + mat;
        double avg = (double)tot / 3;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("----------");
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + String.format("%.1f",avg));

    }

}
