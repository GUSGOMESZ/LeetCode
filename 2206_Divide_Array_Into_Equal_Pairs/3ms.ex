defmodule Solution do
  @spec divide_array(nums :: [integer]) :: boolean
  def divide_array(nums) do
    nums
    |> Enum.sort()
    |> check_pairs()
  end

  defp check_pairs([]), do: true
  defp check_pairs([_]), do: false
  defp check_pairs([a, b | rest]) when a == b, do: check_pairs(rest)
  defp check_pairs(_), do: false
end
