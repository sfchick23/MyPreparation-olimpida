class Calculator:
    @staticmethod
    def average(*args):
        if len(args) == 0:
            return 0
        return sum(args)/len(args)

print(Calculator.average())