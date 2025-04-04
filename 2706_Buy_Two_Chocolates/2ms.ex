defmodule Solution do
  @spec buy_choco(prices :: [integer], money :: integer) :: integer
  def buy_choco(prices, money) do
    {min1, rest} = pop_min(prices)
    {min2, _} = pop_min(rest)
    min_bill = min1 + min2
    if min_bill <= money, do: money - min_bill, else: money
  end

  def pop_min(prices) do
    min = Enum.min(prices)
    {min, List.delete(prices, min)}
  end
end
