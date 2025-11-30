package com.johnkenedy.pchatapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**

 So this chatApp function will create a screen with a standard layout.
 It will reserve space for a bottom bar and then places a content area (Box) in the remaining space.

 */

@Composable
fun ChatApp() {
/**
        Scaffold provides the basic structure

     we can think of Scaffold as a pre-built screen layout.
     It gives us standard slots to place common UI elements like
     a top app bar, a bottom navigation bar, a floating action button.

     So, what it does: It saves us from manually organizing these standard components.

*/
    Scaffold(
        bottomBar = {}
    ) { paddingValues ->
/**
         Inside this Scaffold, we have this paddingValues,
         It tells our content area how much space the top bar or bottom bar is taking up,
         so our content doesn't get hidden underneath them.

         That's why we apply this padding to the root container. That will be this box here.

         What do we need to know about box?
         Box is one of the simplest layout composables.
         Its main job is to stack its children on top of each other.

*/
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // Children placed here would stack on top of each other
            // For example, a background image could be first,
            // and then a text element could be placed on top of it.

            /**
            It's perfect for overlapping elements.
            For example, placing a text label over an image
            or putting a progress indicator on top of your screen content.

            By default, children in a Box are aligned to the TopStart (top-left corner).
            You can easily change this using the contentAlignment parameter
            or the align modifier on each child.

             So we talked about scaffold, box, I`ll cut this video here, so we can keep it simple
             between the videos,
             */
        }
    }
}