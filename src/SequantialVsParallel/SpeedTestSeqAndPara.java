package SequantialVsParallel;

import java.util.stream.IntStream;

import java.util.function.Supplier;

public class SpeedTestSeqAndPara {

	public static void main(String[] args) {
//		System.out.println("Seq result "+ sumUsingSeq());
//		System.out.println("Para result "+ sumUsingPar());
		
		System.out.println("Check performance for Seq "+checkPerformance(SpeedTestSeqAndPara :: sumUsingSeq, 25));
		System.out.println("Check performance for Para "+checkPerformance(SpeedTestSeqAndPara :: sumUsingPar, 25));		
	}
	
	static long checkPerformance(Supplier<Integer> sum,int times) {
		long start = System.currentTimeMillis();
		for(int i = 0;i < times;i ++) {
			sum.get();
		}
		long end = System.currentTimeMillis();
		return end- start ;
	}
	static int sumUsingSeq() {
		return IntStream.rangeClosed(1, 1000000).sum();
	}
	static int sumUsingPar() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();
	}
}
