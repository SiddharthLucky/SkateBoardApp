package com.skateboardshare.skateboard_Rest_API.controller;

import com.skateboardshare.skateboard_Rest_API.models.Skateboard;
import com.skateboardshare.skateboard_Rest_API.service.SkateboardJPAServiceInterface;
import com.skateboardshare.skateboard_Rest_API.service.SkateboardJPAService_JPA;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
class SkateboardControllerTest
{
    @InjectMocks
    private static SkateboardController skateboardController;

    @Mock
    private static SkateboardJPAService_JPA skateboardJPAService_jpa;

    @Test
    void retrieveSkateboard()
    {
        //Arrange
        skateboardController = Mockito.mock(SkateboardController.class);
        Skateboard expected_skateboard = new Skateboard(2, "OWNER2", "TEST2", 45, 30, "LOCATION2", null, false);

        //Act
        Mockito.when(skateboardController.retrieveSkateboard(anyInt())).thenReturn(java.util.Optional.of(expected_skateboard));

        //Assert
        assertThat(skateboardController.retrieveSkateboard(2).equals(Optional.of(expected_skateboard)));
    }

    @Test
    void retrieveAllSkateboards()
    {

    }

    @Test
    void retrieveSkateBoardByLength()
    {

    }

    @Test
    void retrieveSkateboardByWeight()
    {

    }

    @Test
    void retrieveSkateBoardByBrand()
    {

    }

    @Test
    void retrieveSkateBoardByLocation()
    {

    }

    @Test
    void retrieveSkateBoardByOwnersName()
    {

    }

    @Test
    void retrieveSkateBoardByBorrowersName()
    {

    }

    @Test
    void deleteSkateBoard()
    {

    }

    @Test
    void updateSkateBoard()
    {

    }
}