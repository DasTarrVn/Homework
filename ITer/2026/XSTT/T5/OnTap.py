import math


def get_values(x):
    """Trả về list các giá trị khác nhau của X, sắp xếp tăng dần."""
    return sorted(set(x))


def get_pmf(x):
    """Trả về list P, với P[i] là tỉ lệ số ngày có số ca bằng giá trị tại get_values(x)."""
    vals = get_values(x)
    total = len(x)
    return [x.count(v) / total for v in vals]


def expectation(X, P):
    """Trả về kỳ vọng E(X)."""
    res = sum(xi * pi for xi, pi in zip(X, P))
    return round(res, 4)


def variance(X, P):
    """Trả về phương sai Var(X), tính theo công thức sum((xi - mu)^2 * pi)."""
    mu = expectation(X, P)
    res = sum(((xi - mu) ** 2) * pi for xi, pi in zip(X, P))
    return round(res, 4)


def std_dev(X, P):
    """Trả về độ lệch chuẩn sigma."""
    var = variance(X, P)
    return round(math.sqrt(var), 4)


def prob_at_least(x, k):
    """Trả về xác suất có từ k ca trở lên trong một ngày (tính bằng tỉ lệ số ngày trong dữ liệu x)."""
    count = sum(1 for val in x if val >= k)
    return round(count / len(x), 4)


def cdf(X, P, t):
    """Trả về giá trị hàm phân phối tích lũy (CDF) tại t, tức F(t) = P(X <= t)."""
    res = sum(pi for xi, pi in zip(X, P) if xi <= t)
    return round(res, 4)


def z_score(v, mu, sigma):
    """Điểm chuẩn z = (v - mu) / sigma"""
    res = (v - mu) / sigma
    return round(res, 4)


def uniform_cdf(v, a, b):
    """CDF của phân phối đều trên [a, b]"""
    if v < a:
        return 0.0
    if v > b:
        return 1.0
    res = (v - a) / (b - a)
    return round(res, 4)


def normal_pdf(v, mu, sigma):
    """Hàm mật độ của phân phối chuẩn với kỳ vọng mu, độ lệch chuẩn sigma tại v"""
    coefficient = 1 / (sigma * math.sqrt(2 * math.pi))
    exponent = -((v - mu) ** 2) / (2 * (sigma**2))
    res = coefficient * math.exp(exponent)
    return round(res, 4)
