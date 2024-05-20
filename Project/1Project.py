from neuralintents import GenericAssistant
import matplotlib.pyplot as plt
import pandas as pd
import pandas_datareader as web
import mplfinance as mpf

import pickle
import sys
import datetime as dt

#Here we are creating the portfolio:
# portfolio = {'Apple':20,'Telsa':5,'GS':10}

# with open('portfolio.pkl','wb') as f:
#     pickle.dump(portfolio, f)

with open('portfolio.pkl','rb')as f:
    portfolio = pickle.load(f)

    # print(portfolio)

    def save_portfolio():
        with open('portfolio.pkl','wb') as f:
            pickle.dump(portfolio, f)

def add_portfolio():
    ticker = input("Which stock do you want to add:")
    amount = input("How many shares do you want to add :, How many share you want to add into your portfolio")

    if ticker in portfolio.keys():
        portfolio[ticker]+=amount
    else:
        portfolio[ticker] = amount

        save_portfolio()

        #hello



        def remove_portfolio():
            ticker=input("Which stock do you want to sell:")
            amount=input("How many shares do you wanna sell:")

            if ticker in portfolio.keys():
                if amount <=portfolio[ticker]:
                    portfolio[ticker] -=amount
                    save_portfolio
                else:
                    print("You dont have enough shares!")
                
                def show_portfolio():
                    print("Your portfolio:")
                    for ticker in portfolio.keys():
                        print(f"You own {portfolio[ticker]}shares of {ticker}")



        def portfolio_worth():
            sum = 0
            for ticker in portfolio.keys():
                data = web.DataReader(ticker,'yahoo')
                price = data['CLose'].iloc[-1]
                sum +=price
                print(f"your portfolio is worth is{sum}USD")

        def portfolio_gains():
            starting_date =  input("Enter a date for the comparison (YYYY-MM-DD):")
            sum_now = 0
            sum_then= 0

            try:
                      



