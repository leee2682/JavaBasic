import pyupbit

access_key = "yErdN0lPcC0WeEo19Ckixxl9P2vD4P1ukbdINBUK"
secret_key = "XsAujFhEqbCDgyhx2pzxthsyo3nyrnETFh5c23yK"

upbit = pyupbit.Upbit(access_key, secret_key)
ret = upbit.buy_limit_order("KRW-XRP", 100, 20)
print(ret)