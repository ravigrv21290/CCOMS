package com.cloudcomp.ccoms.dept.controller;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {
        "json:target/cucumber-report" }, monochrome = true)
public class CucumberDeptTest {

}
