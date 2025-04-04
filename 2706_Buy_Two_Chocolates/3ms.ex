defmodule Solution do
  @spec buy_choco(prices :: [integer], money :: integer) :: integer
  def buy_choco(prices, money) do
    case get_min_sum(prices) do
        x when x <= money -> (money - x)
        _ -> money
    end 
  end

  def get_min_sum(prices) do
    prices
    |> Enum.sort()
    |> Enum.slice(0, 2)
    |> Enum.sum()
  end
end
