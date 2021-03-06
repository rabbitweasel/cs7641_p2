package rawData;

import java.util.ArrayList;

public class BBC {

    static final int [] BBCIndicesTrain = {6416, 13017, 7033, 2810, 12516, 4035, 1311, 3666, 13009, 12116, 6638, 2095, 8616, 10244, 2169, 8606, 10670, 10145, 1716, 17075, 3622, 6668, 11236, 7719, 9496, 15673, 9684, 75, 4081, 10920, 1483, 6550, 982, 8737, 12502, 6755, 11073, 5850, 16700, 1978, 2612, 13272, 13911, 6098, 2849, 3143, 513, 5813, 15665, 1726, 11090, 9890, 9826, 14249, 5086, 7091, 9285, 4944, 7877, 4774, 12055, 5179, 9816, 4927, 8330, 1539, 5277, 16422, 11885, 17512, 7251, 8994, 2989, 9761, 9541, 1130, 491, 4577, 13471, 10105, 11274, 15760, 14143, 16274, 16679, 16850, 13052, 14480, 14472, 1896, 13122, 3925, 9307, 3556, 6968, 7435, 17114, 7242, 5336, 14210, 3642, 16613, 55, 7537, 7705, 242, 331, 7562, 12257, 12261, 2555, 9613, 17138, 16453, 14509, 6249, 794, 13542, 246, 3728, 680, 15640, 4481, 8786, 2242, 3618, 13865, 2063, 16326, 15110, 10548, 4818, 17260, 263, 7749, 11185, 6092, 11299, 16126, 10688, 4661, 9768, 14324, 16724, 15470, 8366, 1295, 10118, 13461, 13533, 17469, 16757, 16821, 14119, 12936, 8441, 4549, 17560, 2037, 13976, 5248, 12791, 13734, 8645, 4972, 15494, 17441, 2809, 3501, 5497, 4604, 1927, 10999, 11936, 16284, 1203, 1397, 11463, 3685, 1437, 11638, 3657, 11996, 14456, 2151, 10501, 473, 8911, 6445, 3210, 6075, 5702, 4938, 15868, 7418, 15931, 11262, 12632, 15748, 8380, 9928, 4447, 2661, 12654, 17584, 7453, 7335, 14475, 12629, 15704, 9776, 13897, 11890, 3782, 4312, 1630, 13238, 4448, 13348, 12463, 16650, 996, 13139, 15401, 16709, 6179, 1979, 2813, 2462, 9810, 1559, 4527, 1487, 11058, 2513, 999, 1759, 14575, 13942, 9536, 2498, 17629, 11897, 15085, 15417, 5622, 5831, 12669, 5317, 12917, 12340, 2161, 6733, 1408, 8852, 16898, 7148, 10170, 5349, 10373, 10917, 2464, 412, 4043, 5038, 3392, 15442, 11542, 10895, 6452, 12911, 3960, 11013, 10747, 1103, 10009, 16886, 8260, 11242, 13833, 16088, 16039, 12177, 1162, 10149, 1877, 2782, 5851, 7271, 14497, 14834, 15383, 4475, 8177, 10991, 15570, 16723, 11312, 9711, 8076, 7180, 14921, 10762, 16314, 7395, 2967, 7956, 2860, 7356, 12868, 7616, 15040, 8815, 6318, 3530, 17097, 12505, 11060, 11504, 9683, 14569, 1707, 7979, 17255, 15920, 1995, 15269, 17514, 17242, 9334, 16287, 4703, 1516, 13106, 7084, 10396, 13543, 5388, 1857, 3934, 13447, 13032, 15137, 10534, 13038, 4526, 3719, 751, 13384, 2374, 2220, 7516, 15937, 5829, 913, 12734, 12157, 10080, 12600, 14570, 1464, 6240, 7796, 6095, 1002, 11899, 3019, 15424, 14585, 4960, 2128, 4079, 15414, 6406, 1958, 12405, 341, 5639, 14724, 100, 10197, 7268, 11560, 15904, 3878, 14165, 12736, 14364, 8014, 15909, 9542, 1794, 5218, 15095, 4725, 17349, 2315, 14417, 7558, 17360, 10274, 15659, 1044, 3476, 14147, 1931, 9176, 10921, 3166, 6029, 9326, 1337, 17211, 10767, 4263, 11081, 13612, 17245, 8944, 1830, 8655, 5621, 14442, 9752, 1667, 2734, 15373, 10810, 16967, 6845, 1085, 12264, 17638, 17416, 12897, 8244, 238, 4370, 15550, 4258, 5987, 5376, 15732, 10559, 5743, 14756, 16310, 16761, 99, 2251, 15499, 707, 2888, 5633, 7621, 434, 8102, 11880, 6419, 819, 6239, 11137, 1717, 10537, 3334, 11506, 13898, 2573, 2412, 14361, 9100, 5996, 12444, 8438, 1021, 2869, 12252, 3393, 17189, 15554, 12336, 7548, 3661, 5293, 14946, 1644, 10546, 8157, 12778, 554, 12247, 4096, 5105, 11402, 12080, 2597, 15099, 16149, 10366, 9149, 13837, 3121, 7765, 11182, 4396, 6473, 17241, 10881, 9563, 7256, 11813, 3975, 13719, 14062, 3113, 16922, 3328, 17198, 11212, 13614, 126, 2777, 8947, 8927, 14092, 8917, 15183, 7035, 1131, 5687, 14052, 2249, 16626, 2073, 17053, 13788, 7592, 2717, 3641, 15548, 14935, 14595, 200, 3406, 1161, 2961, 10788, 11572, 14907, 1149, 10569, 8264, 10136, 1121, 6805, 17606, 4619, 12888, 8252, 10444, 8676, 4380, 3754, 10680, 12933, 12947, 4946, 10384, 14280, 2681, 5006, 5941, 15194, 7328, 3634, 1456, 17583, 5811, 8784, 1492, 34, 10087, 6615, 13005, 12134, 13528, 13593, 5132, 3283, 6594, 11598, 10912, 14583, 12856, 12035, 8820, 15180, 11275, 4689, 10959, 1964, 9094, 10854, 13215, 15301, 12465, 7145, 6727, 15351, 11499, 10607, 7674, 13262, 8241, 4017, 11772, 8457, 12057, 13577, 4272, 5345, 10441, 9202, 4760, 3065, 12753, 16408, 12901, 3022, 14058, 17499, 13176, 12873, 16332, 17210, 7250, 8101, 13975, 12529, 5603, 177, 14275, 4834, 3949, 7302, 16515, 16641, 2832, 17610, 948, 1129, 14393, 4072, 7167, 13737, 12448, 8621, 1174, 15239, 4909, 308, 9349, 10034, 16775, 17580, 12201, 14028, 6358, 3488, 13221, 9098, 12761, 4869, 2631, 6257, 11247, 8864, 10217, 1303, 4667, 17141, 1729, 7319, 535, 7617, 4509, 13399, 17032, 15851, 14004, 5361, 4560, 16727, 11234, 2705, 5792, 15893, 16457, 17218, 11756, 11467, 12275, 14334, 146, 11174, 14308, 16899, 16545, 4678, 9590, 8496, 7465, 1550, 9161, 7195, 5611, 11000, 449, 17082, 10754, 15207, 16905, 13189, 15929, 16370, 4159, 14155, 14805, 4369, 7450, 6030, 14021, 5012, 17523, 3348, 16429, 12998, 9420, 6374, 7214, 11980, 10856, 855, 17595, 7172, 1928, 1869, 11187, 16819, 12869, 1133, 10576, 2957, 12774, 14857, 3796, 7073, 1581, 13076, 16526, 4236, 7261, 10275, 9809, 2452, 6989, 16451, 4377, 17530, 13001, 16091, 7051, 9600, 4489, 12401, 2146, 5960, 5686, 1271, 7124, 479, 5139, 6606, 5578, 8811, 16053, 15975, 14434, 753, 14534, 11891, 7134, 3579, 6970, 10208, 9002, 1598, 13201, 3987, 17420, 10681, 1413, 17573, 8769, 1596, 3529, 8629, 15343, 14201, 2590, 7017, 2610, 14089, 9522, 7853, 4694, 2808, 3078, 4202, 6278, 3260, 4143, 2565, 14010, 3676, 9121, 7759, 11540, 3527, 15967, 16323, 3748, 3625, 9631, 7277, 15574, 11106, 15002, 4266, 15364, 11779, 7131, 4296, 15575, 6765, 2848, 5683, 6507, 14918, 14298, 13540, 6308, 13027, 2999, 11725, 17681, 17275, 13444, 17436, 12050, 23, 5660, 13880, 7746, 11831, 7539, 9688, 1213, 10263, 7839, 16843, 2656, 13079, 9875, 15240, 7920, 11142, 14212, 13151, 1342, 7932, 13930, 9377, 8200, 16912, 1018, 2338, 1750, 17347, 1291, 4574, 17600, 918, 813, 4874, 17263, 1702, 13832, 3566, 10998, 15789, 10320, 7925, 16439, 9882, 2184, 15353, 10067, 10785, 2594, 8314, 8390, 8129, 8513, 8379, 4705, 4966, 3626, 4242, 1393, 15784, 2525, 7858, 12470, 14591, 8714, 7445, 12986, 17093, 655, 4425, 9978, 16826, 7339, 13209, 1030, 6823, 14596, 4691, 1963, 13453, 3745, 10927, 1047, 13271, 5261, 11631, 7629, 2621, 7451, 12001, 11177, 8086, 12279, 8500, 2870, 10221, 2944, 963, 1298, 2551, 439, 11323, 443, 14302, 1682, 5632, 5347, 14781, 17440, 2200, 14469, 11993, 6108, 7538, 10348, 15884, 12622, 10866, 1280, 2000, 16470, 1867, 3777, 6007, 7098, 102, 3282, 11002, 3939, 8253, 2651, 7490, 13985, 15243, 2003, 6679, 4914, 13639, 12176, 5055, 4771, 13962, 10598, 4762, 9317, 232, 9530, 17382, 8039, 3518, 8901, 12073, 16200, 2301, 3144, 13222, 13269, 11123, 9244, 2313, 10512, 4852, 17663, 9385, 8604, 1514, 17375, 5553, 6121, 6224, 922, 6463, 6043, 112, 10673, 6797, 14050, 17329, 14558, 4970, 2439, 10564, 8235, 7146, 1809, 14176, 9506, 2192, 15837, 4920, 16941, 3466, 11969, 14409, 16395, 5344, 11730, 3982, 13420, 8679, 5058, 7454, 2465, 15820, 15294, 9108, 10214, 16990, 1962, 7510, 12839, 3585, 6458, 8902, 13443, 9446, 4084, 3293, 5445, 236, 10707, 13766, 11046, 7741, 17224, 17333, 11866, 8835, 754, 16588, 5700, 4683, 11480, 9994, 5625, 2107, 16251, 5285, 5017, 13878, 11567, 14513, 10470, 8718, 13829, 14273, 14156, 13232, 1733, 1056, 14875, 15197, 2859, 2157, 9581, 6060, 4083, 4905, 2137, 4261, 12792, 7235, 7253, 2617, 11789, 4328, 2586, 570, 13991, 7660, 7519, 7654, 17488, 9390, 3848, 16638, 17146, 101, 11828, 6730, 15951, 11953, 5724, 12028, 8516, 16097, 8774, 815, 17086, 15321, 7192, 10135, 12347, 8229, 366, 14889, 7544, 14535, 2856, 2783, 16628, 3903, 6896, 15284, 12819, 7082, 478, 7420, 2417, 17290, 14564, 13920, 9341, 6571, 5438, 9148, 17579, 9423, 248, 16336, 4134, 8523, 8711, 6926, 3286, 16049, 3054, 6237, 15118, 11064, 3558, 7522, 9417, 16585, 17269, 16421, 10775, 2839, 571, 12408, 16729, 9028, 9043, 12094, 6678, 14950, 11954, 7661, 8878, 4781, 6005, 5527, 6790, 2682, 15993, 16236, 7903, 7043, 261, 13906, 6503, 10590, 12083, 7010, 4436, 188, 5917, 543, 3888, 7549, 12928, 7963, 7021, 13264, 14618, 15296, 1055, 2521, 3, 17153, 10525, 5809, 5365, 14032, 31, 9910, 4991, 6118, 9838, 5988, 14312, 6554, 11057, 2010, 10773, 16737, 2172, 14771, 15026, 11626, 9972, 636, 3577, 6442, 1874, 8702, 16587, 14015, 3455, 4523, 11817, 11361, 13933, 3891, 14963, 14271, 15717, 10439, 420, 12828, 2459, 2443, 4362, 4062, 10424, 7106, 11780, 8715, 17700, 10984, 12498, 4925, 7381, 8333, 1522, 5073, 4719, 10340, 15211, 4344, 16354, 5360, 15241, 17510, 4192, 1053, 11647, 8943, 13570, 9366, 506, 4216, 4808, 8480, 17640, 4795, 15628, 5912, 17119, 3449, 15861, 17631, 14103, 5390, 14632, 5857, 1071, 767, 5796, 8370, 9744, 6993, 5861, 3744, 17048, 10980, 12490, 1636, 7521, 906, 11495, 1132, 4653, 235, 8320, 1645, 3276, 3105, 15983, 7479, 4287, 3510, 5231, 16374, 16506, 8491, 212, 967, 4108, 1250, 985, 1204, 7723, 4390, 7821, 4616, 8085, 4671, 6682, 17546, 12332, 12215, 6656, 8055, 8640, 5878, 5685, 2385, 12801, 5011, 11511, 16838, 3972, 4453, 5551, 10937, 6742, 5978, 7009, 14792, 8023, 10904, 1889, 10943, 4401, 3313, 6631, 3709, 1260};
    static final int [] BBCIndicesTest = {1732, 7710, 16672, 16896, 9835, 7301, 15278, 8217, 1704, 13170, 9448, 12109, 425, 10111, 7866, 14065, 9492, 15130, 7552, 12400, 7897, 12542, 11205, 10577, 5590, 9873, 16431, 15441, 14603, 15757, 12132, 9482, 14842, 11181, 10692, 6587, 7936, 13510, 7164, 7878, 11206, 14000, 11394, 8234, 15152, 16491, 13135, 668, 10720, 5616, 6109, 7671, 2110, 13536, 11143, 7442, 3226, 9686, 7531, 10538, 4498, 1753, 3564, 10768, 421, 7266, 14969, 8215, 2280, 7675, 12956, 11767, 14819, 7926, 10116, 12283, 12747, 10013, 3213, 12855, 15552, 8395, 10206, 10141, 16686, 9017, 13086, 16692, 11873, 5629, 3253, 3261, 9419, 13506, 11080, 15712, 13917, 8304, 5667, 4571, 13780, 8307, 2074, 9859, 7766, 11482, 12522, 7618, 5286, 7099, 9524, 12390, 7893, 13838, 9325, 1848, 12043, 14231, 1350, 9992, 8649, 13799, 11886, 1873, 17473, 17127, 14438, 13075, 17236, 9708, 17062, 1626, 13547, 927, 6774, 16846, 17715, 14868, 4244, 7259, 3060, 176, 993, 5522, 9823, 14029, 7027, 13785, 11622, 4026, 14853, 4955, 9452, 9936, 6858, 5891, 15956, 9805, 6073, 10626, 5652, 11664, 4776, 16468, 8977, 1199, 1736, 8242, 15896, 5566, 8698, 4386, 6949, 16907, 4082, 1784, 814, 17206, 1818, 13268, 1566, 11614, 7685, 15374, 5310, 11824, 5825, 17615, 2343, 2144, 2845, 15315, 2872, 14151, 6427, 11909, 16857, 12953, 9556, 14128, 1563, 14397, 8053, 9295, 13140, 16218, 8525, 3992, 17685, 13131, 15946, 8240, 12673, 3525, 14193, 8602, 17660, 10418, 10211, 13569, 8900, 10494, 10258, 8058, 7314, 6166, 15676, 8961, 872, 17294, 8549, 10965, 4529, 15802, 9137, 13839, 1127, 520, 8984, 12086, 10404, 15066, 13852, 6950, 4780, 10900, 12769, 13913, 4164, 14046, 13207, 8128, 10031, 3929, 11472, 19, 16031, 8753, 375, 16938, 10898, 13096, 334, 16856, 17183, 6449, 11494, 2599, 12709, 10638, 6450, 9702, 6188, 6435, 12789, 14051, 9624, 15524, 13918, 6080, 15113, 8334, 7477, 8635, 15133, 12478, 5235, 13663, 16403, 13772, 11742, 262, 15914, 12219, 6250, 5545, 6017, 1610, 5267, 12674, 9577, 11164, 631, 12379, 9024, 14755, 5758, 2558, 17338, 13440, 9335, 1426, 10432, 15841, 9819, 1496, 10990, 8502, 2792, 15973, 13226, 3109, 17559, 8600, 2040, 4890, 13995, 16054, 5145, 16847, 3513, 11738, 11642, 10750, 11194, 15406, 2130, 8851, 8342, 6173, 2896, 9962, 4978, 5072, 8705, 8499, 10619, 740, 6303, 15476, 3267, 16492, 17696, 11437, 11624, 9778, 1241, 7891, 15764, 12213, 5333, 1545, 12169, 7553, 992, 16918, 2712, 179, 12968, 9209, 15625, 14970, 13103, 3234, 9055, 16112, 3627, 2710, 15515, 12798, 15484, 1998, 14096, 9272, 13519, 2069, 13433, 13714, 5630, 2550, 15903, 14305, 15184, 1532, 793, 15816, 10764, 14068, 3914, 594, 76, 2790, 5015, 1278, 5168, 976, 6692, 2086, 5257, 4894, 16036, 13336, 7541, 5761, 15767, 9135, 14353, 12781, 15583, 1279, 10429, 5178, 9736, 15355, 9675, 10749, 2992, 667, 16085, 6238, 466, 2262, 5609, 728, 1192, 7229, 7814, 14990, 499, 1062, 13022, 1666, 2985, 5967, 14516, 4404, 11007, 12032, 15393, 15730, 5289, 14416, 11098, 17689, 15596, 8072, 2179, 17042, 3235, 4648, 8066, 523, 12972, 3496, 12999, 827, 17710, 16725, 2799, 9260, 12710, 5113, 8869, 3248, 4634, 9604, 12226, 6960, 13806, 7139, 1346, 6359, 3737, 17052, 2376, 1412, 13555, 14041, 15253, 6049, 12997, 7833, 4178, 16580, 15821, 12824, 6899, 17040, 3309, 5054, 10939, 12331, 4169, 1186, 6907, 5784, 1641, 6050, 2664, 1525, 10322, 10979, 7475, 2394, 16530, 5946, 5064, 699, 10825, 5335, 6210, 14495, 1416, 4011, 1316, 10930, 15237, 12983, 7152, 15218, 4963, 6835, 3280, 12799, 6059, 4777, 4399, 12980, 5708, 16576, 4660, 1461, 997, 13889, 1519, 4911, 882, 2653, 876, 4099, 928, 6367, 2965, 16543, 11713, 17077, 4659, 5847, 702, 14211, 12642, 2188, 8432, 10520, 16193, 10966, 17089, 840, 3795, 2051, 2924, 3863, 940, 4224, 3857, 14648, 8037, 6689, 889, 11579, 4824, 14793, 12833, 144, 1177, 5093, 4632, 7523, 16726, 6498, 4454, 4879, 1634, 1120, 1050, 2371, 15369, 8021, 13610, 15513};

    public static final int [] getBBCIndicesTrain() {
        return BBCIndicesTrain;
    }

    public static final int [] getBBCIndicesTest() {
        return BBCIndicesTest;
    }
}
