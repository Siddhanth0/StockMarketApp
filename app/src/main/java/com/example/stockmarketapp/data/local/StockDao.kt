package com.example.stockmarketapp.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface StockDao {

    @Upsert
    suspend fun insertCompanyListingEntity(
        companyListingEntity: List<CompanyListingEntity>
    )

    @Query("DELETE FROM companylistingentity")
    suspend fun deleteCompanyListing()

    @Query("""
        SELECT * 
        FROM companylistingentity
        WHERE LOWER(name) LIKE'%' || LOWER(:query) || '%' OR UPPER(:query) == symbol
    """)
    suspend fun searchCompanyListing(query: String): List<CompanyListingEntity>

}