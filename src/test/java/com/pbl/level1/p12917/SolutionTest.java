package com.pbl.level1.p12917;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("Zbcdefg -> gfedcbZ")
    void t1() {
        assertThat(new Solution().solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }

}