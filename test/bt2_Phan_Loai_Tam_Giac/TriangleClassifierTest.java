package bt2_Phan_Loai_Tam_Giac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {
    @Test
    void checkTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
       assertEquals ("Tam giác đều",TriangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    void checkTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        assertEquals("Tam giác cân",TriangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    void checkTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        assertEquals("Tam giác vuông",TriangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    void checkTriangle4() {
        int a = 8;
        int b = 2;
        int c = 3;
        assertEquals("Không phải là tam giác ",TriangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    void checkTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;
        assertEquals("Không phải là tam giác ",TriangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    void checkTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;
        assertEquals("Không phải là tam giác ",TriangleClassifier.checkTriangle(a,b,c));
    }
}