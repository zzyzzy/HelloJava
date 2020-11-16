package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v2
 * 이름,국어,영어,수학을 입력받아
 * 총점,평균,학점을 계산하고 결과를 출력
 */
public class SungJukV2 {

    public static void main(String[] args) {
        // 입력처리 (변수선언)
        String name;
        int kor;
        int eng;
        int mat;
        int tot;
        double avg;
        char grd;

        String fmt =
                "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n"
                        + "총점 : %d\n평균 : %.1f\n학점 : %c";

        // 성적처리 (성적 입력, 총점/평균/학점 계산)
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학을 입력하세요 : ");
        mat = sc.nextInt();

        tot = kor + eng + mat;
        avg = (double) tot / 3;

        //grd = (avg >= 90 && avg <= 100) ? '수':
        //	  (avg >= 80 && avg < 90) ? '우' :
        //	  (avg >= 70 && avg < 80) ? '미' :
        //	  (avg >= 60 && avg < 70) ? '양' : '가';

        grd = (avg >= 90) ? '수' :
                (avg >= 80) ? '우' :
                        (avg >= 70) ? '미' :
                                (avg >= 60) ? '양' : '가';

        // 출력처리 (결과 출력)
        System.out.printf(fmt, name, kor, eng, mat,
                tot, avg, grd);
    }

}
