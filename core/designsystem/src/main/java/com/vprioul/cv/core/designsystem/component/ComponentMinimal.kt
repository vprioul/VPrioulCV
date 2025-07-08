package com.vprioul.cv.core.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.designsystem.theme.DpNormal
import com.vprioul.cv.core.designsystem.theme.DpSmall
import com.vprioul.cv.core.designsystem.theme.VPrioulCVTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun MinimalText(
    label: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium
) {
    Text(
        modifier = modifier,
        text = label,
        color = MaterialTheme.colorScheme.onBackground,
        style = style,
    )
}

@Composable
fun MinimalTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        leadingIcon = icon?.let {
            {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = MaterialTheme.colorScheme.primary
        ),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
    )
}

@Composable
fun UnderlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    password: Boolean = false,
) {
    Column(modifier = modifier.fillMaxWidth(),) {
        MinimalText(
            label = label,
            style = MaterialTheme.typography.labelSmall
        )
        TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            leadingIcon = icon?.let {
                {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            },
            placeholder = { Text(label) },
            visualTransformation = if (password) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = MaterialTheme.colorScheme.primary,
                unfocusedIndicatorColor = Color.LightGray,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            )
        )
    }
}

enum class IconLateral { LEFT, RIGHT }

@Composable
fun MinimalIconButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    lateral: IconLateral = IconLateral.LEFT,
    icon: ImageVector = Icons.Default.Add
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.extraSmall,
    ) {
        if (lateral == IconLateral.LEFT) {
            Icon(icon, contentDescription = null)
            Spacer(modifier = Modifier.padding(DpSmall))
        }
        Text(text)
        if (lateral == IconLateral.RIGHT) {
            Spacer(modifier = Modifier.padding(DpSmall))
            Icon(icon, contentDescription = null)
        }
    }
}

@Composable
fun MinimalButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier,) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.extraSmall,
        colors = ButtonDefaults.textButtonColors(
            contentColor = MaterialTheme.colorScheme.primary,
            containerColor = Color.Transparent
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
    ) {
        Text(text)
    }
}

@Composable
fun MinimalCard(title: String, description: String, modifier: Modifier = Modifier,) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(DpNormal),
        shape = MaterialTheme.shapes.extraSmall,
        elevation = CardDefaults.cardElevation(defaultElevation = DpSmall)
    ) {
        Column(modifier = Modifier.padding(DpLarge)) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(DpNormal))
            Text(text = description, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun MinimalList(items: ImmutableList<String>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(DpLarge),
        verticalArrangement = Arrangement.spacedBy(DpMedium)
    ) {
        items(items) { item ->
            MinimalCard(title = item, description = "Description de $item")
        }
    }
}

@Preview
@Composable
private fun MainScreen() {
    var text by remember { mutableStateOf("") }

    VPrioulCVTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(DpLarge),
            verticalArrangement = Arrangement.spacedBy(DpMedium)
        ) {
            MinimalText("Title large", style = MaterialTheme.typography.titleLarge)
            MinimalText("Title medium", style = MaterialTheme.typography.titleMedium)
            MinimalText("Title small", style = MaterialTheme.typography.titleSmall)
            MinimalText(
                label = "Body medium Lorem Ipsum is simply dummy text of the printing and" +
                    " typesetting industry. Lorem Ipsum has been the industry's standard dummy " +
                    "text ever since the 1500s, when an unknown printer took a galley of type and" +
                    " scrambled it to make a type specimen book."
            )
            MinimalText(
                label = "Body small Lorem Ipsum is simply dummy text of the printing and" +
                    " typesetting industry. Lorem Ipsum has been the industry's standard dummy " +
                    "text ever since the 1500s, when an unknown printer took a galley of type and" +
                    " scrambled it to make a type specimen book.",
                style = MaterialTheme.typography.bodySmall
            )
            MinimalText(
                label = "Body large Lorem Ipsum is simply dummy text of the printing and" +
                    " typesetting industry.",
                style = MaterialTheme.typography.bodyLarge
            )
            MinimalTextField(
                value = text,
                onValueChange = { text = it },
                label = "Search",
                icon = Icons.Default.Search
            )
            UnderlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = "Password",
                password = true,
            )
            MinimalButton(text = "Valid", onClick = { /* action */ })
            MinimalIconButton(text = "Add", onClick = { /* action */ })
            MinimalList(items = persistentListOf("Element 1", "Element 2", "Element 3"))
        }
    }
}
