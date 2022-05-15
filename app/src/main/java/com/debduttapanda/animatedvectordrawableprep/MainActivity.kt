package com.debduttapanda.animatedvectordrawableprep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi
import androidx.compose.animation.graphics.res.animatedVectorResource
import androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter
import androidx.compose.animation.graphics.vector.AnimatedImageVector
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.debduttapanda.animatedvectordrawableprep.ui.theme.AnimatedVectorDrawablePrepTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedVectorDrawablePrepTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xff171717)
                ) {
                    LazyColumn{
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_animals_buffalo_to_hippo,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_animals_hippo_to_elephant,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_animals_elephant_to_buffalo,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_circular_arrow,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_settings,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_clock_timer,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_progress_indeterminate_circular,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_trimclip_airplane_disabled_to_enabled,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_checkable_checkbox_checked_to_unchecked,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_checkable_expandcollapse_collapsed_to_expanded,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_checkable_radiobutton_checked_to_unchecked,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_clock_alarm,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_clock_clock,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_fingerprint_error_to_on,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_fingerprint_on_to_off,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_handwriting_io16,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_music_previous,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_music_next,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_arrowoverflow_arrow_to_overflow,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_crosstick_cross_to_tick,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_drawer_arrow_to_hamburger,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_plusminus_minus_to_plus,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_playpausestop_play_to_pause,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_playpausestop_stop_to_play,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_trimclip_flashlight_enabled_to_disabled,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_trimclip_heart_break,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_trimclip_heart_fill,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_trimclip_searchback_back_to_search,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_0_to_1,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_1_to_2,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_2_to_3,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_3_to_4,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_4_to_5,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_5_to_6,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_6_to_7,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_7_to_8,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                        item{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ){
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_8_to_9,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_9_to_8,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                                AnimatedVector(
                                    R.drawable.avd_pathmorph_digits_9_to_0,
                                    2000L,
                                    100,
                                    Modifier.weight(1f)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalAnimationGraphicsApi::class)
    @Composable
    private fun AnimatedVector(
        @DrawableRes drawable: Int,
        time: Long,
        height: Int,
        modifier: Modifier = Modifier,
        on: Boolean = false,
    ) {
        val state = remember { mutableStateOf(on) }
        val painter = rememberAnimatedVectorPainter(
            AnimatedImageVector.animatedVectorResource(id = drawable),
            state.value
        )
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .then(
                    modifier
                )
                .height(height.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painter,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        state.value = !state.value
                    }
            )
        }
        LaunchedEffect(Unit){
            while(true){
                delay(time)
                state.value = !state.value
            }
        }
    }
}