import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) 
				throws IOException {
		
		long start = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		
		/** 
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	9498	시험 성적
		 */
		/*
		getMatcher(sc);
		*/

		/**	
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	10817	세 수
		 */
		/*
		getTreepleMiddleValue(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	10871	X보다 작은 수
		 */
		/*
		getLessX(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4    1546       평균
		 */

		/*
		getAverage(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5    4344       평균은 넘겠지
		 */
		/*
		getAverageOver(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 6    1110        더하기 사이클
		 */
		
		/*
		getLoopCycle(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	4673	셀프 넘버
		 */
		/*
		getNotSelfNumber();
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	1065	한수
		 */	
		/*
		getSinleDefValue(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	2448	별 찍기 - 11
		 */	
		/*
		getPrintStar(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	1152	단어의 개수
		 */
		/*
		getTokenCount(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	2577	숫자의 개수
		 */
		/*
		getCountNumber(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	8958	OX퀴즈
		 */
		/*
		getOXQuiz(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4	2920	음계
		 */
		/*
		getSortCheck(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	10039	평균 점수
		 */
		/*
		getSelectiveAverage(sc);
		*/
		long end = System.currentTimeMillis();

		System.out.printf("실행 시간 : %.3f(초)",(end-start) / 1000.0);
	}
	
	/**
	 * Test ::
	 * 10
	 * 65
	 * 100
	 * 30
	 * 95
	 * 
	 * @param sc Scanner
	 */
	public static void getSelectiveAverage(Scanner sc) {

		int value = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())
					      .stream()
					      .map(e->e<40?40:e)
					      .collect(Collectors.averagingInt(e->e))
					      .intValue();


		System.out.println(value);
	}
	
	/**
	 * Test ::
	 * 1 2 3 4 5 6 7 8
	 * 
	 * @param sc Scanner
	 */
	public static void getSortCheck(Scanner sc) {
		
		String sLine = sc.nextLine();

		String sAsc  = _getPlainText(_getStringStream(sLine).sorted());
		String sDesc = _getPlainText(_getStringStream(sLine).sorted((x,y)->y.charAt(0)-x.charAt(0)));
		
		if(sLine.equals(sAsc)) {
			
			System.out.println("ascending");
		} else if(sLine.equals(sDesc)) {
			
			System.out.println("descending");
		} else {
			
			System.out.println("mixed");
		}
	}
	
	public static String _getPlainText(Stream stream) {
		
		return stream.collect(Collectors.toList()).toString().replaceAll("[\\[,\\]]", "");
	}
	
	public static Stream<String> _getStringStream(String str) {
		
		return Arrays.stream(str.split(" "));
	}
	
	/**
	 * Test 
	 * 5
	 * OOXXOXXOOO
	 * OOXXOOXXOO
	 * OXOXOXOXOXOXOX
	 * OOOOOOOOOO
	 * OOOOXOOOOXOOOOX
	 * 
	 * @param sc Scanner
	 */
	public static void getOXQuiz(Scanner sc) {
		int loop = sc.nextInt();
		
		List<String> list = getStringListForScanner(loop, sc);
		
		list.stream().forEach(Main::_getOXQuiz);
	}
	
	public static void _getOXQuiz(String str) {

		int iSize = str.length()+1;
		int iScore = 0;
		int iAcc = 0;
		
		while(iSize-->1)
			iScore += iAcc = str.substring(iSize-1, iSize).equals("X") ? 0 : iAcc+1;
		

		System.out.println(iScore);
	}
	
	/**
	 * Test ::
	 * 135
	 * 662
	 * 412
	 * 
	 * @param sc Scanner
	 */
	public static void getCountNumber(Scanner sc) {
		
		int result = sc.nextInt() * sc.nextInt() * sc.nextInt();
		
		String sIn = (Integer.toString(result) + "0123456789");
		
		Arrays.stream(sIn.split(""))
		      .collect(Collectors.groupingBy(t->t))
		      .values()
		      .forEach(e->System.out.println(e.size()-1));
	}
	
	
	/**
	 * Test ::
	 * Hello World TokenCount
	 * 
	 * @param sc Scanner
	 * @throws IOException BufferReader Exception
	 */
	public static void getTokenCount(Scanner sc) throws IOException {
		
		int value = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine()).countTokens();
		
		
		System.out.print(value);
	}
	
	/**
	 * Test ::
	 * 24
	 * 
	 * @param sc Scanner
	 */
	public static void getPrintStar (Scanner sc) {
		
		int container_size = sc.nextInt(); 

		_getPrintStar(null, 1, container_size/3);
	}
	
	public static void _getPrintStar (int[][] container, int iSLV, int iCLV) {
		
		int iHeight,
		    iWidth,
		    iMeddle,
		    iExPoint,
		    iExLine;
		
		iExLine = (iExPoint = ((iMeddle = (iWidth = (iHeight = iSLV * 3) * 2) / 2 - 1) + 1) / 2);
		
		int[][] new_container = new int[iHeight][iWidth];
		
		if(iSLV == 1) {

			new_container[0][iMeddle] 
					= new_container[1][iMeddle-1]
							= new_container[1][iMeddle+1]
									= 1;
			
			int cks = iMeddle+3;
			
			while(cks-->iMeddle-2)
				new_container[2][cks] = 1;
			
		} else {
			
			for(int x = 0 ; x < container.length ; x++) {

				for(int y = 0 ; y < container[x].length ; y++ ){
					
					new_container[x][y+iExPoint] 
							= new_container[iExLine][y] 
									= new_container[iExLine][iHeight+y] 
											= container[x][y];
				}

				iExLine++;
			}

			
		}
		
		if(iSLV >= iCLV) {
			
			_rendering(new_container);
		} else {

			_getPrintStar(new_container, iSLV*2, iCLV);
		}
		
	}
	
	public static void _rendering(int[][] container){
		
		StringBuilder sb = new StringBuilder();
		
		for(int x = 0 ; x < container.length ; x++) {
			
			for(int y = 0 ; y < container[x].length ; y++) {
				
				sb.append(container[x][y] == 0 ? " " : "*");
			}
			
			sb.append("\n");
		}
		
		
		System.out.println(sb.toString());
	}
	
	/**
	 * Test :: 101
	 * 
	 * @param sc Scanner
	 */
	public static void getSinleDefValue (Scanner sc) {
		
		int loop = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		while(loop-->0) {
			
			list.add(loop+1);
		}
		
		long value = list.stream().filter(e->{
			
			int f = e;
			
			if(e/100 == 0) return true;
			
			int af = f%10
			  , bf = f/10%10
			  , cf = bf-af;

			while(f/10 != 0)
				if((bf = (f = f/10)%10)-af != cf) return false;
				else af = bf;

			return true;

		}).count();
		
		
		System.out.println(value);
	}
	
	/**
	 * Test ::
	 */
	public static void getNotSelfNumber () {
		
		final int loop = 10000;
		
		Set<Integer> set = new HashSet<>();
		
		StringBuffer sb = new StringBuffer();

		for(int localLoop = 1; 
			    localLoop < loop;
				_getCachedSelfNumber(localLoop++, loop, set)) {

			if(!set.contains(localLoop)) sb.append(localLoop+"\n");
		}
		
		
		System.out.print(sb.toString());
	}

	public static void _getCachedSelfNumber (int loop, int pool, Set<Integer> set) {
		
		int cache;
		
		while(loop<pool) {
			
			while((cache = loop)/10 > 0) {
				loop += cache % 10;
				cache = cache / 10;
			}

			loop += cache % 10;

			if(set.contains(loop))return;

			set.add(loop);
		}

	}

	/**
	 * Test ::
	 * 1
	 * @param sc Scanner
	 */
	public static void getLoopCycle (Scanner sc) {
		
		int leak, root;
		
		leak = root = sc.nextInt();
		
		int count = 0;
		
		do {
			
			leak = (leak%10 *10) + ((leak/10 + leak%10)%10);
			count++;
		}while(root != leak);
		
		
		System.out.println(count);
	}
	
	/**
	 * Test ::
	 * 5
	 * 5 50 50 70 80 100
	 * 7 100 95 90 80 70 60 50
	 * 3 70 90 80
	 * 3 70 90 81
	 * 9 100 99 98 97 96 95 94 93 91
	 * 
	 * @param sc
	 */
	public static void getAverageOver (Scanner sc) {
		
		StringBuilder builder = new StringBuilder();
		
		int loop = sc.nextInt();
		
		int subloop;
		
		while(loop --> 0) {
			
			subloop = sc.nextInt();
			
			List<Integer> gradeList = getIntListForScanner(subloop, sc);
			
			final double dAverage = gradeList.stream()
					                         .reduce((x,y) -> x+y)
					                         .get() / (double)subloop;
			
			builder.append(String.format("%.3f%%\n", gradeList.stream()
					                                          .filter(x -> x>dAverage)
					                                          .count() / (double)subloop *100 ));
		}
		
		
		System.out.println(builder.toString());
	}
	
	/**
	 * Test ::
	 * 3
	 * 40 80 60
	 * 
	 * @param sc Scanner
	 */
	public static void getAverage (Scanner sc) {
		
		int loop = sc.nextInt();
		
		List<Double> list = getDoubleListForScanner(loop, sc);
		
		final Double MaxScore = list.stream()
				                    .sorted((x,y)->(int)(y-x))
				                    .findFirst()
				                    .get();
		
		double value = list.stream()
				           .map(x->x/MaxScore*100)
				           .collect(Collectors.averagingDouble(x->x));
		
		
		System.out.println(value);
		
	}
	
	public static void getMatcher (Scanner sc) {
		
		int grade = sc.nextInt();
		
		String gradeName;
		
		if(grade/90 == 1){
			gradeName = "A";
		} else if(grade/80 == 1) {
			gradeName = "B";
		} else if(grade/70 == 1) {
			gradeName = "C";
		} else if(grade/60 == 1) {
			gradeName = "D";
		} else {
			gradeName = "F";
		}
		
		
		System.out.println(gradeName);
	}

	/**
	 * Test ::
	 * 10 20 30
	 * 
	 * @param sc Scanners
	 */
	public static void getTreepleMiddleValue (Scanner sc){
		
		int value = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())
					.stream()
					.sorted()
					.collect(Collectors.toList())
					.get(1);
		
		
		System.out.println(value);
	}
	
	/**
	 * Test ::
	 * 10 5
	 * 1 5 7 9 21 5 6 7 8 2
	 * 
	 * @param sc Scanner
	 */
	public static void getLessX (Scanner sc) {
	
		int loop     = sc.nextInt();
		
		int lessThen = sc.nextInt();
		
		List<Integer> list = getIntListForScanner(loop, sc);

		String value = list.stream()
                        .filter(x->x<lessThen)
                        .collect(Collectors.toList())
                        .toString()
                        .replaceAll("[\\[,\\]]", "");
		
		
		System.out.println(value);
		
	}
	
	public static <T> List<T> getListForScanner (int loop, Scanner sc, Class<T> klazz, ScannerCallback<T> scannerCallback) {
		
		List<T> list = new ArrayList<>();
		
		while(loop --> 0) {
			
			list.add(scannerCallback.getValue(sc));
		}
		
		return list;
	}

	public static List<String> getStringListForScanner (int loop, final Scanner sc) {
		sc.nextLine();
		return getListForScanner(loop, sc, String.class, scanner -> scanner.nextLine());
	}
	
	public static List<Integer> getIntListForScanner (int loop, final Scanner sc) {
		
		return getListForScanner(loop, sc, Integer.class, scanner -> scanner.nextInt());
	}
	
	public static List<Double> getDoubleListForScanner (int loop, Scanner sc) {
		
		return getListForScanner(loop, sc, Double.class , scanner -> scanner.nextDouble());
	}
	
	interface ScannerCallback<T> {
		
		T getValue(Scanner sc);
	}
	
	
}
