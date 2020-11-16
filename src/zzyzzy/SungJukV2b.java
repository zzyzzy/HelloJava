package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2b.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v2b
 * 이름,국어,영어,수학을 입력받아
 * 총점,평균,학점을 계산하고 결과를 출력
 * 학점 계산시 switch문 사용
 */
public class SungJukV2b {

    public static void main(String[] args) {
        // 변수 선언
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

        // 성적 처리
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

        switch ((int) avg / 10) {
            case 10:
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            default:
                grd = '가';
                break;
        }

        // 결과 출력
        System.out.printf(fmt,
                name, kor, eng, mat, tot, avg, grd);
    }
}
