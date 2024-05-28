package test.suite;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTest;
import test.categorii.CuMock;
import test.categorii.FaraMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.ExcludeCategory(CuMock.class)
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {
}