package com.project.cookbook.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.project.cookbook.data.database.entities.FavouritesEntity
import com.project.cookbook.data.database.entities.FoodJokeEntity
import com.project.cookbook.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavouritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {
    abstract fun recipesDao(): RecipeDao
}