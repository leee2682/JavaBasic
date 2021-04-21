import sys
import pyupbit

from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("mywindow.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pushButton.clicked.connect(self.inquiry)

    def inquiry(self):
        BTC = pyupbit.get_current_price("KRW-BTC")
        ETH = pyupbit.get_current_price("KRW-ETH")
        XRP = pyupbit.get_current_price("KRW-XRP")
        self.BTC_Edit.setText(str(BTC))
        self.ETH_Edit.setText(str(ETH))
        self.XRP_Edit.setText(str(XRP))

app = QApplication(sys.argv)
window = MyWindow()
window.show()
app.exec_()