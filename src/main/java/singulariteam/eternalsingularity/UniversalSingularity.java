package singulariteam.eternalsingularity;

/*
 * Created by WanionCane(https://github.com/WanionCane).
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import javax.annotation.Nonnull;
import java.util.List;

public final class UniversalSingularity
{
	public final String name;
	public final List<UniversalSingularityWrapper> singularities;

	public UniversalSingularity(@Nonnull final String name, @Nonnull final List<UniversalSingularityWrapper> singularities)
	{
		this.name = name;
		this.singularities = singularities;
	}
}