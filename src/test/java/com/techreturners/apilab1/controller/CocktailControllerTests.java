package com.techreturners.apilab1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CocktailControllerTests {
    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetCocktail() throws Exception {
        String expectedContent = "Popular Cocktails";
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/cocktails"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testGetCocktailWithoutRequestParams() throws Exception {
        String expectedContent = "Pina Colada";
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/cocktail"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedContent));
    }
}
