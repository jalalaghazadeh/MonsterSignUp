package com.mrjalal.monsterlabtesttask.core.presentation.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mrjalal.monsterlabtesttask.R

@Composable
fun CustomIcon(
    modifier: Modifier = Modifier,
    iconId: Int,
    onClick: (() -> Unit)? = null,
    iconDescription: String = "icon",
    tintColor: Color = Color.Black,
) {
    Box(
        modifier = Modifier
            .requiredSize(48.dp)
            .padding(8.dp)
            .then(modifier)
            .clickable { if (onClick != null) onClick() }
    ) {
        Icon(
            painter = painterResource(iconId),
            contentDescription = iconDescription,
            tint = tintColor,
            modifier = Modifier.requiredSize(24.dp)
        )
    }
}

@Preview(
    name = "default",
    widthDp = 100,
    heightDp = 100,
    backgroundColor = 0xfff0f0f0,
    showBackground = true
)
@Composable
fun Preview_CustomIcon_Default() {
    CustomIcon(
        iconId = R.drawable.ic_cross,
        onClick = {},
        tintColor = MaterialTheme.colorScheme.tertiary,
        modifier = Modifier.padding(16.dp)
    )
}