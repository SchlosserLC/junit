package com.github.schlosserlc.junit;

import java.math.BigDecimal;

public class Calc {

  public static BigDecimal getValueInstallment(BigDecimal amound, int numberInstallment){

    return amound.divide(new BigDecimal(numberInstallment));

  }

}
