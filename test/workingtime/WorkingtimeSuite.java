/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package workingtime;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lidia Parral
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({workingtime.database.DatabaseSuite.class, workingtime.views.ViewsSuite.class, workingtime.utilities.UtilitiesSuite.class, workingtime.WorkingTimeTest.class})
public class WorkingtimeSuite {
    
}
