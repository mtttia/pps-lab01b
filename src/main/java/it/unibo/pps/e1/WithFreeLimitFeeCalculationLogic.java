package it.unibo.pps.e1;

public class WithFreeLimitFeeCalculationLogic implements FeeCalculationLogic {

    private final int freeFeeLimit;
    private final FixedFeeCalculationLogic fixedFeeCalculationLogic;

    public WithFreeLimitFeeCalculationLogic(int freeFeeLimit, int feeAmount){
        this.freeFeeLimit = freeFeeLimit;
        fixedFeeCalculationLogic = new FixedFeeCalculationLogic(feeAmount);
    }

    @Override
    public int applyFee(int amount) {
        return amount < freeFeeLimit ? amount : fixedFeeCalculationLogic.applyFee(amount);
    }
}
