/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/kapt")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class Kapt3BuilderModeBytecodeShapeTestGenerated extends AbstractKapt3BuilderModeBytecodeShapeTest {
    public void testAllFilesPresentInKapt() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/kapt"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM, true);
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/dataClass.kt");
        doTest(fileName);
    }

    @TestMetadata("errorTypes.kt")
    public void testErrorTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/errorTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("innerClasses.kt")
    public void testInnerClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/innerClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("interfaceImpls.kt")
    public void testInterfaceImpls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/interfaceImpls.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/jvmOverloads.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdas.kt")
    public void testLambdas() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/lambdas.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/kapt/simple.kt");
        doTest(fileName);
    }
}
