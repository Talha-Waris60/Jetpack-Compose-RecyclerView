package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun PreviewItem() {
   LazyColumn(content = {
       items(getCategoryList()) { item ->
           BlogCategoryItem(img = item.img, title = item.title, subtitle = item.subtitle)
       }
   })
}


@Composable
fun BlogCategoryItem(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ), modifier = Modifier.padding(8.dp),
        shape = RectangleShape
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img), contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_person, "Programming", "Learn Different Languages" ))
    list.add(Category(R.drawable.ic_person, "Technology", "News about new Tech" ))
    list.add(Category(R.drawable.ic_person, "Full Stack Development", "From Frontend to Backend" ))
    list.add(Category(R.drawable.ic_person, "DevOps", "Development, CI, CD etc" ))
    list.add(Category(R.drawable.ic_person, "AI & ML", "Basic Artificial Intelligence" ))

    list.add(Category(R.drawable.ic_person, "Programming", "Learn Different Languages" ))
    list.add(Category(R.drawable.ic_person, "Technology", "News about new Tech" ))
    list.add(Category(R.drawable.ic_person, "Full Stack Development", "From Frontend to Backend" ))
    list.add(Category(R.drawable.ic_person, "DevOps", "Development, CI, CD etc" ))
    list.add(Category(R.drawable.ic_person, "AI & ML", "Basic Artificial Intelligence" ))

    list.add(Category(R.drawable.ic_person, "Programming", "Learn Different Languages" ))
    list.add(Category(R.drawable.ic_person, "Technology", "News about new Tech" ))
    list.add(Category(R.drawable.ic_person, "Full Stack Development", "From Frontend to Backend" ))
    list.add(Category(R.drawable.ic_person, "DevOps", "Development, CI, CD etc" ))
    list.add(Category(R.drawable.ic_person, "AI & ML", "Basic Artificial Intelligence" ))

    return list
}