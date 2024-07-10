def emoji_converter(message):
    words = message.split(" ")
    emojis = {
        ":)" : "😄",
        ":(" : "🤮"
    }
    Output = ""
    for s in words:
        Output += emojis.get(s,s)+" "
    return Output

message = input(">")
print(emoji_converter(message))

#message = input("> ")
# words = message.split(' ')
# emojis = {
#     ":)" : "😄",
#     ":(" : "🤮"
# }
# Output = ""
# for s in words:
#     Output += emojis.get(s,s)+" "
# print(Output)