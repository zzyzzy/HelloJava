package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV4.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v4
 * 학생 1명의 성적 데이터(이름,국어,영어,수학)를
 * 입력받아 총점,평균,학점을 계산하고 결과를 출력
 * 단, 성적입력/총점계산/평균계산/학점계산을
 * 메서드로 정의해서 처리함
 * 성적입력 : readName, readKor, readEng, readMat
 * 총점계산 : getTotal
 * 평균계산 : getAverage
 * 학점계산 : getGrade
 */
public class SungJukV4 {

    public static void main(String[] args) {
        // 변수선언
        String name;
        int kor, eng, mat;
        int tot;
        double avg;
        char grd;
        String fmt =
                "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n"
                        + "총점 : %d\n평균 : %.1f\n학점 : %c";

        // 성적처리
        name = readName();
        kor = readKor();
        eng = readEng();
        mat = readMat();
        tot = getTotal(kor, eng, mat);
        avg = getAverage(tot);
        grd = getGrade(avg);

        // 결과출력
        System.out.printf(fmt,
                name, kor, eng, mat, tot, avg, grd);
    }

    // 이름입력
    public static String readName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        return name;
    }

    // 국어점수입력
    public static int readKor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어를 입력하세요 : ");
        int kor = sc.nextInt();
        return kor;
    }

    // 영어점수입력
    public static int readEng() {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어를 입력하세요 : ");
        int eng = sc.nextInt();
        return eng;
    }

    // 수학점수입력
    public static int readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학을 입력하세요 : ");
        int mat = sc.nextInt();
        return mat;
    }

    // 총점계산
    public static int getTotal(
            int kor, int eng, int mat) {
        int tot = kor + eng + mat;
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
