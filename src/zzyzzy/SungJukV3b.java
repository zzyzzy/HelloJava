package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV3b.java
 * 작성일 : xxxx.xx.xx
 * 파일설명 : 성적처리 프로그램
 *
 * 프로그램 설명 : 성적처리프로그램 v3b
 * 학생 3명의 성적 데이터(이름,국어,영어,수학)를
 * 입력받아 총점,평균,학점을 계산하고 결과를 출력
 */
public class SungJukV3b {

    public static void main(String[] args) {
        // 변수 선언
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int tot[] = new int[3];
        double avg[] = new double[3];
        char grd[] = new char[3];

        String fmt =
                "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n"
                        + "총점 : %d\n평균 : %.1f\n학점 : %c";

        Scanner sc = new Scanner(System.in);

        // 성적 처리
        for (int i=1; i<=3; ++i) {
            System.out.println(i+ "번째 학생 성적 입력중...");

            System.out.print("이름을 입력하세요 : ");
            name[i-1] = sc.nextLine();
            System.out.print("국어를 입력하세요 : ");
            kor[i-1] = Integer.parseInt(sc.nextLine());
            System.out.print("영어를 입력하세요 : ");
            eng[i-1] = Integer.parseInt(sc.nextLine());
            System.out.print("수학을 입력하세요 : ");
            mat[i-1] = Integer.parseInt(sc.nextLine());

            // 수학성적 입력시 같이 입력된 엔터키가
            // 다음 데이터(이름) 입력시 입력값으로 자동으로 전달됨
            // 그러한 상황을 해결하기 위해 아예 점수데이터를
            // 문자로 입력받아 숫자로 변환후 처리
        }

        for (int i=1; i<=3; ++i) {
            tot[i-1] = kor[i-1] + eng[i-1] + mat[i-1];
            avg[i-1] = (double)tot[i-1] / 3;

            switch((int)(avg[i-1]/10)) {
                case 10:
                case 9: grd[i-1] = '수'; break;
                case 8: grd[i-1] = '우'; break;
                case 7: grd[i-1] = '미'; break;
                case 6: grd[i-1] = '양'; break;
                default : grd[i-1] = '가';
            }
        }

        // 결과 출력
        for (int i=1; i<=3; ++i) {
            System.out.printf(fmt, name[i-1],
                    kor[i-1],eng[i-1],mat[i-1],
                    tot[i-1],avg[i-1],grd[i-1]);
        }

    }

}
