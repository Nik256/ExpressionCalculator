package com.epam.calc;

import com.epam.calc.negative.CalculatorNegativeTest;
import com.epam.calc.positive.CalculatorPositiveTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@SelectClasses({CalculatorPositiveTest.class, CalculatorPositiveTest.class})
@Suite.SuiteClasses({CalculatorNegativeTest.class, CalculatorPositiveTest.class})
public class CalculatorTestSuite {
}