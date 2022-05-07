package com.example.rahulpandeyrecyclerview

data class Contact (
    val name: String,
    val age: Int
        ){
    val imageUrl = "https://picsum.photos/150?random=$age"
}