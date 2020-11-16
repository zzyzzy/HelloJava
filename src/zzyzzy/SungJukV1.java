package zzyzzy;

/**
 * 파일명 : SungJukV1.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 설정하고
 * 총점,평균을 계산하고 결과를 출력
 */
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
