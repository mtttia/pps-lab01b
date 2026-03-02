package it.unibo.pps.e1;

public class WithFreeLimitFeeCalculationLogic implements FeeCalculationLogic {

    private final int freeFeeLimit;
    private final int feeAmount;

    public WithFreeLimitFeeCalculationLogic(int freeFeeLimit, int feeAmount){
        this.freeFeeLimit = freeFeeLimit;
        this.feeAmount = feeAmount;
    }

    @Override
    public int applyFee(int amount) {
        return amount < freeFeeLimit ? amount : amount + feeAmount;
    }
}
