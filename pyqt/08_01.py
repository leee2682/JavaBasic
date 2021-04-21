import pyupbit

tickers = pyupbit.get_tickers()
print(tickers)

price = pyupbit.get_current_price(["KRW-XRP", "KRW-BTC"])
print(price)