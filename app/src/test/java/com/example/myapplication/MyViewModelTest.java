package com.example.myapplication;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MyViewModelTest {

    @Test
    public void testViewModel() {
        MyViewModel mvm = new MyViewModel();
        assertThat(mvm.getFlag(), is(false));
        mvm.pokeFlag();
        assertThat(mvm.getFlag(), is(true));
    }
}