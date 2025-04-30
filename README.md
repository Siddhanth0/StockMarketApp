# Stock Market App 📈

**Stock Market App** is a modern Android application built with a clean architecture approach using the **MVI** pattern. It displays a list of stocks and detailed stock info including intraday data. The app uses **Alpha Vantage API** to fetch real-time market data.

---

## 🔧 Tech Stack

- **Kotlin**
- **MVI Architecture**
- **Retrofit** - For API calls to Alpha Vantage
- **Room** - For local caching of company data
- **OpenCSV** - For parsing CSV intraday data
- **Hilt (Dagger)** - For dependency injection
- **Jetpack Compose** - For modern, declarative UI
- **Coroutines & Flow** - For asynchronous and reactive programming

---

## 💡 Features

- 🔍 View list of publicly traded stocks
- 📊 Click on a stock to see its company info and intraday graph
- 📁 Caches data locally using Room
- 🔄 Real-time updates via Alpha Vantage
- 🎨 Clean, cryptic-themed UI with neon green and dark backgrounds

---

## 🧪 API Used

**[Alpha Vantage API](https://www.alphavantage.co/)** – Free stock market API providing JSON and CSV data.

---
