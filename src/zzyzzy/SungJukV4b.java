package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV4b.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v4b
 * 학생 1명의 성적 데이터(이름,국어,영어,수학)를
 * 입력받아 총점,평균,학점을 계산하고 결과를 출력
 * 단, 성적입력/총점계산/평균계산/학점계산을
 * 메서드로 정의해서 처리함
 * 성적입력 : readSungJuk
 * 총점계산 : getTotal
 * 평균계산 : getAverage
 * 학점계산 : getGrade
 */
public class SungJukV4b {

    public static void main(String[] args) {
        // 변수선언
        String name;
        String kor, eng, mat;
        int tot;
        double avg;
        char grd;
        String fmt =
                "이름 : %s\n국어 : %s\n영어 : %s\n수학 : %s\n"
                        + "총점 : %d\n평균 : %.1f\n학점 : %c";

        // 성적처리
        name = readSungJuk("이름");
        kor = readSungJuk("국어");
        eng = readSungJuk("영어");
        mat = readSungJuk("수학");

        tot = getTotal(kor, eng, mat);
        avg = getAverage(tot);
        grd = getGrade(avg);

        // 결과출력
        System.out.printf(fmt,
                name, kor, eng, mat, tot, avg, grd);
    }

    // 이름/국어/영어/수학 입력
    private static String readSungJuk(String hdr) {
        Scanner sc = new Scanner(System.in);
        System.out.print(hdr+"을 입력하세요 : ");
        String data = sc.nextLine();
        sc = null;

        return data;
    }

    // 총점계산
    public static int getTotal(
            String kor, String eng, String mat) {
        int tot = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(mat);
        return tot;
    }

    // 평균계산
    public static double getAverage(int tot) {
        double avg = (double)tot / 3;
        return avg;
    }

    // 학점계산
    public static char getGrade(double avg) {
        char grd = ' ';
        switch( (int)avg/10 ) {
            case 10:
            case 9: grd = '수'; break;
            case 8: grd = '우'; break;
            case 7: grd = '미'; break;
            case 6: grd = '양'; break;
            default : grd = '가'; break;
        }
        return grd;
    }

}
