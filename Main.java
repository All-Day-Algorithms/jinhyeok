import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) 
				throws IOException {
		
		long start = System.currentTimeMillis();
		
		Scanner sc        = new Scanner(System.in);
		
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
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
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	11654	아스키 코드
		 */
		
		/*
		getConvertAscii(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	10809	알파벳 찾기
		 */
		
		/*
		getArangeOfAlpha(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	2675	문자열 반복
		 */
		
		/*
		getLoopString(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4	1157	단어 공부
		 */
		
		/*
		getCountingGroup(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	1316	그룹 단어 체커
		 */
		
		/*
		getGroupWord(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 7	2908	상수
		 */
		
		/*
		getSangSu(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 8	5622	다이얼
		 */
		
		/*
		getDial(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 9	2941	크로아티아 알파벳
		 */
		
		/*
		getCroatiaAlpha(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	2438	별 찍기 - 1
		 */
		
		/*
		getStartOne(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	2292	벌집
		 */
		
		/*
		getPrintBeeHouse(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	1193	분수찾기
		 */
		
		/*
		getFraction(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4	1011	Fly me to the Alpha Centauri
		 */
		
		/*
		getAlphaCentauri2(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	10250	ACM 호텔
		 */
		
		/*
		getAcmHotel(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	10250	ACM 호텔
		 */
		
		/*
		get2007(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 7	2775	부녀회장이 될테야
		 */
		
		/*
		getDoFemalePresident(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 8	1475	방 번호
		 */
		
		/*
		getRoomNumber(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 9	6064	카잉 달력
		 */

		/*
		getKaing(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 1	2750	수 정렬하기
		 */
		
		/*
		getSort(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 2	2751	수 정렬하기 2
		 */

		/*
		getSort2(sc);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 3	10989	수 정렬하기 3
		 */

		/*
		getSort3(in);
		*/

		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 4	2108	통계학
		 */
		
		/*
		getStatistics(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 5	1427	소트인사이드
		 */
		
		/*
		getSortInside(sc);
		*/
		
		/**
		 * ---------------------
		 * 단계    문제 번호     제목
		 * ---------------------
		 * 6	1181	단어 정렬
		 */
		
		/*
		getSortWord(sc);
		*/
		
		
		
		
		
		long end = System.currentTimeMillis();
 
		//System.out.printf("실행 시간 : %.3f(초)",(end-start) / 1000.0);
	}
	
	
	/**
	 * 13
	 * but
	 * i
	 * wont
	 * hesitate
	 * no
	 * more
	 * no
	 * more
	 * it
	 * cannot
	 * wait
	 * im
	 * yours
	 * 
	 * @param sc
	 */
	public static void getSortWord(Scanner sc) {
		int nWordCount = sc.nextInt();
	
		getStringListForScanner(nWordCount, sc).stream().sorted((e,f)->{
			int nLe = e.length();
			int nLf = f.length();
			
			if(nLe == nLf) return _sortCompareTo(e, f);	
			else return nLe - nLf;
			
		}).distinct().forEach(System.out::println);
	}
	
	
	public static int _sortCompareTo(String l, String f) {
		
		for(int iLength = 0 ; iLength < l.length() ; iLength++) {
			int nCharDeff = l.charAt(iLength) - f.charAt(iLength);
			
			if(nCharDeff != 0) {
				return nCharDeff;
			}
		}
		
		return 0;
	}
	
	/**
	 * Test ::
	 * 2143
	 * 
	 * @param sc
	 */
	public static void getSortInside(Scanner sc) {
		
		String sVal = Arrays.stream(sc.nextLine().split(""))
				            .sorted((e,f)->Integer.valueOf(f)-Integer.valueOf(e))
				            .reduce((t,u)->t+u)
				            .get();
		
		System.out.println(sVal);
		
		
	}
	
	/**
	 * 5
	 * 1
	 * 3
	 * 8
	 * -2
	 * 2
	 * 
	 * @param sc
	 */
	public static void getStatistics(Scanner sc) {
		List<Integer> stream = getIntListForScanner(sc.nextInt(), sc).stream()
																	 .sorted()
																	 .collect(Collectors.toList());

		int iSize = stream.size();

		Map<Integer, Integer> hm = new HashMap<>();

		int iAcu = 0, iAvg = 0	/** 산술 평균  */
		  , iMid = (iSize / 2), iMidValue = 0 /** 중앙 값 */
		  , iBetween = 0, iMin = Integer.MAX_VALUE, iMax = Integer.MIN_VALUE /** 범위 값, 최소 값, 최대 값 */
		  , iCnt = 0, iMmp = 0, iBc = 0
		  ;
		
		List<Integer> alt = new ArrayList<>();
		
		for( int i = 0 ; i < iSize ; i++ ) {

			int iRow = stream.get(i);

			// 산술평균 을 위한 합계
			iAcu += iRow;
			
			// 최소 값
			if ( iMin > iRow ) iMin    = iRow;
			// 최대 값
			if ( iMax < iRow ) iMax    = iRow;
			// 중간 값
			if ( iMid == i ) iMidValue = iRow;
			
			// 최빈 값을 찾기 위하여 카운팅
			if(hm.containsKey(iRow)) iCnt = hm.get(iRow)+1;
			else iCnt = 1;

			// 최빈 값과 동일 할 경우 리스트에 캐시
			if(iMmp == iCnt) alt.add(iRow);
			
			// 현재 최빈 값 보다 높은 수일 경우 테이블 변경
			if(iMmp < iCnt) {
				iMmp = iCnt;
				alt.clear();
				alt.add(iRow);
			}
			
			hm.put(iRow, iCnt);
		}
		
		iAvg     = Math.round(iAcu/(float)iSize);
		iBetween = (iMax - iMin);
		iBc = alt.size() > 1 ? alt.get(1) : alt.get(0);
		
		System.out.println(iAvg);
		System.out.println(iMidValue);
		System.out.println(iBc);
		System.out.println(iBetween);
	}
	
	/**
	 * Test ::
	 * 10
	 * 5
	 * 2
	 * 3
	 * 1
	 * 4
	 * 2
	 * 3
	 * 5
	 * 1
	 * 7
	 * 
	 * @param in BufferedReader 
	 * 
	 * @throws IOException 
	 */
	public static void getSort3(BufferedReader in) throws IOException {
		
		getCountingSort(new BufferedScanner(in));
	}
	
	
	/**
	 * 스캐너와 동일 하기 사용 하기 위하여 클래스 선언
	 */
	static class BufferedScanner {

		private BufferedReader in;

		public BufferedScanner(BufferedReader in) {
			this.in = in;
		}
		
		public int nextIntLine() throws IOException {

			return Integer.parseInt(in.readLine());
		}
	}
	
	public static void getCountingSort(BufferedScanner in) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iCountNumber  = in.nextIntLine()
		  , maxCount      = 99999
          , iMax          = 0
          , iCachedNumber = 0;

        int[] iArr = new int[maxCount];

		while(iCountNumber --> 0) 
			iArr[(iCachedNumber = in.nextIntLine()) > iMax ? 
					iMax = iCachedNumber : iCachedNumber]++;

        for (int i = 0; i <= iMax; i++)
        	if (iArr[i] == 0) continue;
        	else while(iArr[i]-->0) out.write(i + "\n");
        
        out.flush();
	}
	
	/**
	 * Test ::
	 * 5
	 * 5
	 * 4
	 * 3
	 * 2
	 * 1
	 * 
	 * @param sc Scanner
	 * @throws IOException 
	 */
	public static void getSort2(Scanner sc) throws IOException {
		int[] unsorted = getIntListForScanner(sc.nextInt(), sc).stream()
				                                               .mapToInt(e->e)
				                                               .toArray();
		getMergeSort(unsorted);
	}
	
	/**
	 * 병합 정렬
	 * @param unsorted 정렬 되지 않은 배열
	 * 
	 * @throws IOException
	 */
	public static void getMergeSort(int[] unsorted) throws IOException {

		new MergeSortableNode(unsorted)
							.sortChain()
							.print();
	}
	/**
	 * 병합 정렬을 위한 클래스
	 */
	static class MergeSortableNode {
		
		public MergeSortableNode(int[] values) {
			this.values = values;
			
			int iMid = Math.round(values.length / (float)2);
			
			if(values.length > 1) {
				
				/** Divide (분할)*/
				childNodes    = new MergeSortableNode[2];
				childNodes[0] = new MergeSortableNode(Arrays.copyOfRange(values, 0, iMid));
				childNodes[1] = new MergeSortableNode(Arrays.copyOfRange(values, iMid, values.length));
			}
		}
		
		/**
		 * 출력 함수
		 * 
		 * @throws IOException
		 */
		private void print() throws IOException {
			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
			for(int x : values) out.write(x+"\n");
			out.flush();
		}

		private int[] getElements() { return this.values; }
		
		/**
		 * 정렬 함수
		 * @return 현재 객체 반환
		 */
		public MergeSortableNode sortChain(){
			
			if(childNodes == null) return this;
			
			/** Conquer (정복)*/
			childNodes[0].sortChain();
			childNodes[1].sortChain();
			
			/** Combine (결합)*/
			int[] m = childNodes[0].getElements();
			int[] n = childNodes[1].getElements();
			
			int ix = 0
			  , iy = 0;
			
			for(int i = 0 ; i < values.length ; i++) {
				
				if(ix >= m.length)
					values[i] = n[iy++];
				else if(iy >= n.length)
					values[i] = m[ix++];
				else
					if(m[ix] < n[iy]) values[i] = m[ix++];
					else values[i] = n[iy++];
			}
			
			return this;
		}
		
		private int[] values;
		
		private MergeSortableNode[] childNodes;
	}
	
	
	/**
	 * Test ::
	 * 5
	 * 5
	 * 2
	 * 3
	 * 4
	 * 1
	 * 
	 * @param sc
	 */
	public static void getSort(Scanner sc) {

		getIntListForScanner(sc.nextInt(), sc).stream()
											  .sorted()
											  .distinct()
											  .forEach(System.out::println);
	}
	
	/**
	 * Test 
	 * 3
	 * 10 12 3 9
	 * 10 12 7 2
	 * 13 11 5 6
	 * 
	 * @param sc
	 * @throws IOException
	 */
	public static void getKaing(Scanner sc) throws IOException {
		
		int iLoopCount = sc.nextInt();
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(iLoopCount --> 0) {
			
			int iX = sc.nextInt()
			  , iY = sc.nextInt()
			  , iM = sc.nextInt()
		      , iN = sc.nextInt()
			  , ix = iM
			  , iy = iN
			  , iEnd = (iX%2 == 0 && iY %2 == 0) ? ( (iX * iY) / 2 ) : (iX * iY);
			
			while(true) {
				
				if(ix >= iEnd || iy >= iEnd) {
					out.write(-1+"\n");
					break;
				} else if(ix == iy) {
					out.write(ix+"\n");
					break;
				}
				
				if(ix > iy) iy += iY;
				
				if(ix < iy) ix += iX;
			}
			
			out.flush();
		}
	}
	

	/**
	 * Test ::
	 * 9999
	 * 
	 * @param sc
	 */
	public static void getRoomNumber(Scanner sc) {
		
		String str = Integer.toString(sc.nextInt());
		
		int[] iCountList = new int[9];
		
		for(int i = 0 ; i < str.length() ; i++) {

			int iValue = Integer.valueOf(str.substring(i, i+1));
			
			iCountList[iValue == 9 ? 6 : iValue] += 1;
		}
		
		if(iCountList[6] > 0) {
			iCountList[6] = Math.round(iCountList[6] / (float)2);
		}
		
		System.out.println(Arrays.stream(iCountList).max().getAsInt());
	}
	
	/**
	 * Test ::
	 * 2
	 * 1
	 * 3
	 * 2
	 * 3
	 * 
	 * @param sc
	 */
	public static void getDoFemalePresident(Scanner sc){
		
		int iRoomCount = sc.nextInt();
		
		while(iRoomCount --> 0) {
			
			int iDong = (sc.nextInt() + 1);
			int iHo   = sc.nextInt();
			
			int[][] sApt = new int[iDong][iHo];
			
			for(int i = 0 ; i < iDong ; i++) {
				for(int j = 1 ; j <= iHo ; j++) {
					
					if(i == 0) {
						
						sApt[i][j-1] = j;
					} else if(j == 1) {
						
						sApt[i][j-1] = 1;
					} else {
						
						sApt[i][j-1] = sApt[i-1][j-1] + sApt[i][j-2]; 
					}
				}
			}

			System.out.println(sApt[iDong-1][iHo-1]);
		}
	}
	
	/**
	 * 1 1
	 * 
	 * @param sc Scanner
	 */
	public static void get2007(Scanner sc) {

		int mm = sc.nextInt();
		int dd = sc.nextInt();

		String[] binder = new String[] {
			"SUN", "MON", "TUE", "WED",
			"THU", "FRI", "SAT"	
		};
		
		System.out.println(binder[new java.sql.Date(2007-1900, mm-1, dd).getDay()]);
	}

	/**
	 * Test :: 
	 * 2
	 * 6 12 10
	 * 30 50 72
	 * 
	 * @param sc
	 * @throws IOException 
	 */
	public static void getAcmHotel(Scanner sc) throws IOException {

		int iCustomerCount = sc.nextInt();

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		while(iCustomerCount --> 0) {

			int iX = sc.nextInt();sc.nextInt();

			int iCount = sc.nextInt();
			
			int iDong  = (iCount % iX);
			int iHo    = (iCount / iX);

			if(iDong == 0) iDong += iX;
			else iHo += 1;

			out.write( Integer.toString(iDong) + _lpad(Integer.toString(iHo), 2, '0')+"\n");
		}

		out.flush();
	}

	/**
	 * Test ::
	 * 3
	 * 0 3
	 * 1 5
	 * 45 50
	 * @param sc
	 * @throws IOException 
	 */
	public static void getAlphaCentauri1(Scanner sc) throws IOException {
		
		int nCase = sc.nextInt();
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(nCase --> 0) {
			
			int nX             = sc.nextInt()
			  , nY             = sc.nextInt()
			  , nInterval      = (nY - nX)
			  , nWarpCount     = 1
			  , nWarpInterval  = 1
			  , nArrangedCount = 0;

			BlackHole:
			while(true) {
			
				for(int n = 0 ; n < 2 ; n++, nWarpCount++)
					if(nInterval <= (nArrangedCount += nWarpInterval))
						break BlackHole;

				nWarpInterval++;
			}
			out.write(Integer.toString(nWarpCount)+"\n");
		}
		out.flush();
	}
	
	/**
	 * 예상 수의 범위를 계산한다.
	 * 
	 * @param num 예상 할 수액
	 * @return 예상 수 값
	 */
	public static Map<Integer, Integer> cashedMap = new HashMap<>(); 
	public static int getFactorialAccumNumberOver (int num) {
		
		if(num == 1) {
			
			return num;
		}
		
		int iCached_Number;
				
		if(cashedMap.containsKey(num)) {

			iCached_Number = cashedMap.get(num);
		} else {
			
			iCached_Number = num + getFactorialAccumNumberOver(num-1);
			cashedMap.put(num, iCached_Number);
		}
		
		return iCached_Number;
	}

	/**
	 * Test ::
	 * 3
	 * 0 3
	 * 1 5
	 * 45 50
	 * @param sc
	 * @throws IOException 
	 */
	public static void getAlphaCentauri2(Scanner sc) throws IOException {
		
		int iWrapTotalCount = sc.nextInt();
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 최초 인자로 받아온 값 만큼 워프 한다. (3 대입)
		while( iWrapTotalCount --> 0 ) {
			
			// 워프 시작 지점과 종료 지점을 설정 한다. (0 3 대입)
			int nStart = sc.nextInt();
			int nEnd   = sc.nextInt();
			
			// 총 워프 할 길이를 구한다. (종료 지점 - 시작 지점)
			int iTotalWrapMeters = (nEnd - nStart);
			
			// 중간 지점까지는 속도를 증가 시킬 예정이므로 중간 지점을 구한다.
			int iHalfMeters = Math.round(iTotalWrapMeters / (float)2);
			
			// 워프 거리, 횟수, 속도를 (1)로 초기화
			int iWrapMeter = 1
			   ,iWrapCount = 1
			   ,iWrapSpeed = 1;
			
			// 워프 거리가 총 워프 거리에 도달 할 때 까지 순환
			while(iWrapMeter < iTotalWrapMeters) {
				
				// 중간 지점 이전까지는 증가 또는 등식 연산
				if(iWrapMeter < iHalfMeters) {
					
					// 중간 이전 까지는 증가 연산 [ 1,2,3,2,1] 의 경우에서 [1,2]에 해당
					if(iWrapMeter + iWrapSpeed + 1 < iHalfMeters) {

						iWrapMeter += iWrapSpeed += 1;
					} else {

						// 중간의 경우 현재 까지의 거리를 계산하여 증가 또는 등식 연산
						if((iTotalWrapMeters - (iWrapMeter + iWrapSpeed + 1)) < iWrapMeter) {
							
							// 숫자 8의 경우 8 - (3 + 2 + 1) < 3 에 해딩
							iWrapMeter += iWrapSpeed;
						} else {
							
							// 숫자 9의 경우 9 - (3 + 2 + 1) < 3 에 해당
							iWrapMeter += iWrapSpeed += 1;
						}
					}
					
				} else { 
					// 중간 이후 부터는 증감 또는 등식 계산
					
					// 예상 가능한 수를 계산한다.
					int iAccNumber = getFactorialAccumNumberOver(iWrapSpeed);
	
					// 이후 나올 총 예상 합계와 현재 합계를 계산하여 증감 또는 등식 연산  
					if(iAccNumber > (iTotalWrapMeters - iWrapMeter)) {
						
						// 작을 경우 증감 연산
						iWrapMeter += iWrapSpeed -= 1;
						
					} else {
						// 많거나 같을 경우 등식 연산
						iWrapMeter += iWrapSpeed;
					}
				}
				iWrapCount++;
			}
			out.write(Integer.toString(iWrapCount)+"\n");
		}
		out.flush();
	}
	
	public static Map<Integer, Integer> hm = new HashMap<>();
	
	public static int gf (int n) {
		
		if(n == 1) return n;
		
		int in;
				
		if(hm.containsKey(n)) in = hm.get(n);
		else hm.put(n, in = n + gf(n-1));
		
		return in;
	}
	
	/**
	 * 난독화된 getAlphaCentauri2
	 * @param sc Scanner
	 * 
	 * @throws IOException
	 */
	public static void getAlphaCentauri3(Scanner sc) throws IOException {
		
		int ic = sc.nextInt();
		
		BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while( ic --> 0 ) {
			
			int s = sc.nextInt(), e = sc.nextInt(), im = (e - s)
			   ,h = Math.round(im / (float)2)
               ,m = 1, c = 1, sp = 1;
			
			while(m < im) {
				m += m < h ? sp + 1 < h ? (sp += 1) : (im - (m + sp + 1)) < m ? sp : (sp += 1) : gf(sp) > (im - m) ? (sp -= 1) : sp;
				c++;
			}
			o.write(Integer.toString(c)+"\n");
		}
		o.flush();
	}

	/**
	 * Test ::
	 * 14
	 * 
	 * @param sc Scanner
	 */
	public static void getFraction(Scanner sc) {
		int nFract = sc.nextInt();
		
		int[] iRsn = _getRoundFraction(nFract);
		
		int nLevel = 1;
		int nCount = nFract - (iRsn[0] - (nLevel =iRsn[1]));
		
		int sP = nLevel % 2 == 0 ? nLevel-(nLevel - nCount) : (nLevel + 1 - nCount);
		int sC = nLevel % 2 == 0 ? (nLevel + 1 - nCount) : nLevel-(nLevel - nCount);


		System.out.println(sP+"/"+sC);
	}
	
	public static int[] _getRoundFraction (int nSt) {
		int[] nR = new int[]{1, 1};
		
		while(nSt > nR[0]) {
			
			nR[0]+=(++nR[1]);
		}
		
		return nR;
	}

	/**
	 * Test ::
	 * 13
	 * 
	 * @param sc Scanner
	 */
	public static void getPrintBeeHouse(Scanner sc) {
		
		int c = _factorialBee(sc.nextInt(), 1, 1);
		
		
		System.out.println(c);
	}

	public static int _factorialBee(int c, int n, int k) {

		if(c == 1) return 1;
		
		if((c-2) / (6*n) > 0) 
			return _factorialBee(c, n+(++k), k);
		
		return k+1;
	}
	
	/**
	 * Test ::
	 * 5
	 * 
	 * @param sc
	 */
	public static void getStartOne(Scanner sc) {

		int nStarCount = sc.nextInt();
		int nLoopCount = nStarCount;

		while(nLoopCount-->0) {

			System.out.println(_rpad("", (nStarCount - nLoopCount), '*'));
		}
	}

	public static String _rpad(String str, int count, char filler) {

		if(str.length() >= count) {

			return str;
		}
		
		for(int s = str.length() ; s < count ; s++) {
			str = str + filler;
		}
		
		return str;
	}
	
	public static String _lpad(String str, int count, char filler) {

		if(str.length() >= count) {

			return str;
		}
		
		for(int s = str.length() ; s < count ; s++) {
			str = filler + str;
		}
		
		return str;
	}
	
	/**
	 * Test ::
	 * c=ad-ljnjk
	 * 
	 * @param sc Scanner
	 */
	public static void getCroatiaAlpha(Scanner sc) {
		
		int nCount = sc.nextLine()
				       .replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ")
				       .length();
		
		
		System.out.println(nCount);
	}
	
	/**
	 * Test :
	 * UNUCIC
	 * @param sc Scanner
	 */
	public static void getDial (Scanner sc) {
		final int CONST_ALPHA_ASCII = 65;
		
		final int nOffsetNumber = CONST_ALPHA_ASCII - (3 * 2);

		String sResult = Arrays.stream(sc.nextLine().split("")).reduce("0", (r,e)->{
			
			int nOrder = (int)e.charAt(0);

			int nDiscunt = (nOrder > 82 ? nOrder > 89 ? 2 : 1 : 0);
			
			int oDialCount = 1 + ((nOrder - nDiscunt - nOffsetNumber) / 3);
					
			int nRepeat = Integer.valueOf(r) + oDialCount;

			return Integer.toString(nRepeat);
		});
		
		
		System.out.println(sResult);
	}
	

	
	/**
	 * Test ::
	 * 734 893
	 * @param sc Scanner
	 */
	public static void getSangSu(Scanner sc) {
		
		int value = Arrays.asList(sc.next(), sc.next())
						  .stream()
						  .map(Main::_getReverseWord)
						  .map(Main::_getStringToInt)
						  .sorted((e,f)->(f-e))
						  .collect(Collectors.toList())
						  .get(0).intValue();

		
		System.out.println(value);
		
	}
	
	public static String _getReverseWord(String str) {
		StringBuffer sb = new StringBuffer();
		
		int reverLength = str.length();
		
		while(reverLength-->0) {
			sb.append(str.charAt(reverLength));
		}
		
		return sb.toString();
	}
	
	public static int _getStringToInt(String s) {
		return Integer.valueOf(s);
	}
	
	/**
	 * Test ::
	 * 3
	 * happy
	 * new
	 * year
	 * 
	 * @param sc Scanner
	 */
	public static void getGroupWord(Scanner sc) {
		
		String s = getStringListForScanner(sc.nextInt(), sc)
						.stream()
						.reduce("0", Main::_reduceOverGroup);

		
		System.out.println(s);
	}
	
	private static String _reduceOverGroup(String param, String str) {
		
		Set<Character> cs = new HashSet<>();
		
		char cachedCharacter = 0;
		
		for(int iLength = 0 ; iLength < str.length() ; iLength++) {
			
			char c = str.charAt(iLength);
			
			if(cachedCharacter == c) continue;
			
			if(cs.contains(c)) return param;
			
			cs.add(cachedCharacter = c);
		}
		
		return Integer.toString((Integer.valueOf(param))+1);
	}
	
	/**
	 * Test ::
	 * Mississipi
	 * 
	 * @param sc Scanner
	 */
	public static void getCountingGroup(Scanner sc) {
		final int CONST_ALPHA_ASCII = 65;
		
		int[] Lascii = new int[26];
		String sStr = sc.nextLine();
		
		Arrays.stream(sStr.split("")).forEach(e->{
			
			++Lascii[(int)e.toUpperCase().charAt(0) - CONST_ALPHA_ASCII];
		});
		
		int Lsize = Lascii.length;
		int iMaxIndex = 0
		   ,iCount = 0
		   ,iMax = -1
		   ,iTemp = iMax;
		
		while ( Lsize-->0 ) {
			
			iTemp = Lascii[Lsize];
			
			if ( iTemp == iMax ) {
				
				iCount++;
			}else if ( iTemp > iMax ) {
				
				iMaxIndex = Lsize;
				iMax      = iTemp;
				iCount    = 1;
			}
		}
		
		System.out.println(iCount > 1 ? "?":(char)(iMaxIndex+CONST_ALPHA_ASCII));
	}
	
	/**
	 * Test ::
	 * 2
	 * 3 ABC
	 * 5 /HTP
	 * 
	 * @param sc Scanner
	 */
	public static void getLoopString(Scanner sc) {
		
		int iLoop = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		while(iLoop --> 0){

			int iSize = sc.nextInt();

			new StringBuffer(sc.next().trim()).chars().forEach(e-> {
				for(int i = 0 ; i < iSize ; i++) sb.append((char)e);
			});
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	/**
	 * Test ::
	 * baekjoon
	 * 
	 * @param sc Scanner
	 */
	public static void getArangeOfAlpha(Scanner sc) {
		
		String sStr = sc.next();
		
		int[] aList = new StringBuffer("abcdefghijklmnopqrstuvwxyz")
							.chars()
							.map((v) -> sStr.indexOf(v))
							.toArray();
		
		String cachedResult; 
		for (int i = 0 ; i < aList.length ; i++) {
			
			cachedResult = i == aList.length-1 ? aList[i] + "" : aList[i]+" ";	
				
			System.out.print(cachedResult);
		}
		
	}
	
	/**
	 * Test :: 
	 * a
	 * 
	 * @param sc Scanner
	 */
	public static void getConvertAscii(Scanner sc) {
		
		String sStr = sc.next();
		
		char cObjectString = sStr.substring(0,1).charAt(0);
		
		
		System.out.println((int)cObjectString);
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
