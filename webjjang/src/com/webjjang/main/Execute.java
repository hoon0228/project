package com.webjjang.main;

public class Execute {

	// 서비스 객체를 받아서 실행하는 메서드
	public static Object run(Service service, Object obj) throws Exception {
		System.out.println("Execute.run() >>>>>>>>>>>>>>>>");
		
		System.out.println("===<< 로그 출력 >>===================");
		System.out.println(" 실행 객체 : " + service.getClass().getSimpleName());
		System.out.println(" 넘어가는 데이터 : " + obj);
		
		Object result = null;
		
		// 실행
		long startTime = System.nanoTime();
		result = service.service(obj);
		long endTime = System.nanoTime();
		System.out.println(" 처리 결과 : " + result);
		System.out.println(" 처리 소요시간 : " + (endTime - startTime));
		System.out.println("====================================");
		
		return result;
	}
	
}
