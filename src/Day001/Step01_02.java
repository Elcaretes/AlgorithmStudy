package Day001;

import java.util.Scanner;

/**
 * 백준 단계별로 풀어보기
 *	1단계_입출력과 사칙연산
 *		A+B
 *			https://www.acmicpc.net/problem/1000
 *
 *	<문제>
 *	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 *	<입력>
 *	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 *	<출력>
 *	첫째 줄에 A+B를 출력한다.
 *
 */
class Step01_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}

}
