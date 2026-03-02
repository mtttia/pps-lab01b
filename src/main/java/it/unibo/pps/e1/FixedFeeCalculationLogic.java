package it.unibo.pps.e1;

public class FixedFeeCalculationLogic implements FeeCalculationLogic{
    private final int feeAmount;

    public FixedFeeCalculationLogic(int feeAmount){
        this.feeAmount = feeAmount;
    }

    @Override
    public int applyFee(int amount) {
        return amount + feeAmount;
    }
}
