package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer countingOutRhymer = new defaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			countingOutRhymer.countIn(super.countOut());

		int result = countingOutRhymer.countOut();

		while (!countingOutRhymer.callCheck())
			countIn(countingOutRhymer.countOut());

		return result;
	}
}